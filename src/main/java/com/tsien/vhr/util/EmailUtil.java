package com.tsien.vhr.util;

import com.tsien.vhr.model.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.springframework.messaging.MessagingException;

import javax.mail.internet.MimeMessage;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/27 0027 18:29
 */

@Getter
@Setter
public class EmailUtil implements Runnable {

    /**
     * 员工
     */
    private Employee employee;


    /**
     * JavaMailSender
     */
    private JavaMailSender javaMailSender;

    /**
     * TemplateEngine
     */
    private TemplateEngine templateEngine;

    /**
     * emailAddress
     */
    private String emailAddress;

    public EmailUtil(Employee employee,
                     JavaMailSender javaMailSender,
                     TemplateEngine templateEngine, String emailAddress) {
        this.employee = employee;
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;
        this.emailAddress = emailAddress;
    }

    @Override
    public void run() {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(employee.getEmail());
            helper.setFrom(emailAddress);
            helper.setSubject("XXX集团：通知");
            Context ctx = new Context();
            ctx.setVariable("employeeName", employee.getEmployeeName());
            ctx.setVariable("workNumber", employee.getWorkNumber());
            ctx.setVariable("contractPeriod", employee.getContractPeriod());
            ctx.setVariable("contractBegin", employee.getContractBegin());
            ctx.setVariable("contractBegin", employee.getContractBegin());
            ctx.setVariable("departmentName", employee.getDepartmentName());
            ctx.setVariable("positionName", employee.getPositionName());
            String mail = templateEngine.process("email.html", ctx);
            helper.setText(mail, true);
            javaMailSender.send(message);

        } catch (MessagingException e) {
            System.out.println("发送失败");

        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
    }
}

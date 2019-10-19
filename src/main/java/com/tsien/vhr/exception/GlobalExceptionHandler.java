package com.tsien.vhr.exception;

import com.tsien.vhr.util.ServerResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/19 0019 15:24
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public ServerResponse sqlException(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return ServerResponse.error("该数据有关联数据，操作失败");
        }

        return ServerResponse.error("数据库异常，操作失败");
    }
}

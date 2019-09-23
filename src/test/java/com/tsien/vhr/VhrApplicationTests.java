package com.tsien.vhr;

import com.tsien.vhr.dao.ResourceDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class VhrApplicationTests {

    @Resource
    private ResourceDAO resourceDAO;

    @Test
    public void contextLoads() {
    }


    @Test
    public void test() {

        List<com.tsien.vhr.model.Resource> resources = resourceDAO.listResources();
        if (resources == null) {
            System.out.println("空的");
            return;
        }
        System.out.println(resources);
    }

}

package com;

import com.dave.sun.Application;
import com.dave.sun.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Super.Sun on 2017/11/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PageTest {

    @Autowired
    private IDemoService demoService;

    @Test
    public void test(){
        demoService.getUserList(1, 10);
    }
}

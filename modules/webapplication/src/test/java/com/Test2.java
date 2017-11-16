package com;

import com.dave.sun.Application;
import com.dave.sun.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Super.Sun on 2017/11/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test2 {

    @Autowired
    UserMapper userMapper;

    @Test
    public void add(){
        userMapper.insert("张三", 11);
    }




}
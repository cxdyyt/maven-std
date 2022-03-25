package com.jh.dao;

import com.jh.domain.UserEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao-config.xml")
@Transactional
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void testOne() {
        List<UserEntity> res = userDao.fetchAll();
        Assert.assertEquals(1, res.get(0).getId());
    }
}

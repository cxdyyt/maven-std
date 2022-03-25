package com.jh.service;

import com.jh.dao.UserDao;
import com.jh.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserEntity> getAllUser() {
        return userDao.fetchAll();
    }
    public Integer saveOne(UserEntity userEntity) {
        return userDao.saveOne(userEntity);
    }
}

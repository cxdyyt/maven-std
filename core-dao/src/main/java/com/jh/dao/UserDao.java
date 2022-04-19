package com.jh.dao;

import com.jh.domain.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<UserEntity> fetchAll() {
        Session session = sessionFactory.getCurrentSession();
        org.hibernate.query.Query query = session.createQuery("from UserEntity ");
        List<UserEntity> res = query.list();
        System.out.println("gitt");
        return res;
    }
    public Integer saveOne(UserEntity userEntity) {
        Session session = sessionFactory.getCurrentSession();
        Integer  res= (Integer) session.save(userEntity);
        return res;
    }
}

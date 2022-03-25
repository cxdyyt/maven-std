package com.jh.service;
import com.jh.dao.FirstDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {
    @Autowired
    FirstDao firstDao;
    public String getName(){
        return firstDao.getEntity();
    }
}

package com.fangs.service.impl;

import com.fangs.dao.UserDao;
import com.fangs.entity.User;
import com.fangs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public String getUserByLoginname(String loginname) {
        User user = userDao.getUserByname(loginname);
        return user.getUserName();
    }
}

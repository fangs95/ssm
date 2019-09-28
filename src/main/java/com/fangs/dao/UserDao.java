package com.fangs.dao;

import com.fangs.entity.User;

public interface UserDao {
    public User getUserByname(String loginName);
}

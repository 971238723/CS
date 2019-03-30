package com.itheima.dao;

import com.itheima.domain.User;

public interface UserDao {
    //根据id查询
    public User findById(Integer id);
}

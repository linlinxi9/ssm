package com.sangeng.dao;

import com.sangeng.domain.User;

import java.util.List;

public interface UserDao {
//    根据id查询用户
    User findById(Integer id);

    List<User> findAll();

    void insertUser(User user);

    void deleteUser(Integer id);

    void updateUser(User user);
}

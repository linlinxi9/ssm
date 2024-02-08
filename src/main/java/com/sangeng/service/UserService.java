package com.sangeng.service;

import com.sangeng.common.PageResult;
import com.sangeng.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();

    PageResult findByPage(Integer pageSize, Integer pageNum);

    void insertUser(User user);

    void deleteUser(Integer id);

    void updateUser(User user);

    void test();
}

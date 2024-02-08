package com.sangeng.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sangeng.common.PageResult;
import com.sangeng.dao.UserDao;
import com.sangeng.domain.User;
import com.sangeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public PageResult findByPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userDao.findAll();
        PageInfo pageInfo = new PageInfo(list);
//        PageResult pageResult = new PageResult(pageInfo.getPageNum(),pageInfo.getPageSize(), (int) pageInfo.getTotal(),list);
        PageResult pageResult = new PageResult(pageNum,pageSize, (int) pageInfo.getTotal(),list);
        return pageResult;
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }


    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    @Override
    public void test() {
        userDao.insertUser(new User(null,"test1",11,"cc"));
//        System.out.println(1/0);
        userDao.insertUser(new User(null,"test2",12,"cc2"));
    }
}

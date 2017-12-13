package com.bailian.service.product.service.impl;


import com.bailian.service.product.dao.UserMapper;
import com.bailian.service.product.model.User;
import com.bailian.service.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        try {
            Random rand = new Random();
            long wait = rand.nextInt(3000);
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userMapper.selectAll();
    }

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int saveOrUpdate(User user) {
        if (user.getId() != null) {
            return userMapper.updateByPrimaryKey(user);
        } else {
            return userMapper.insertUseGeneratedKeys(user);
        }
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}

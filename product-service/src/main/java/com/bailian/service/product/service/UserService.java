package com.bailian.service.product.service;


import com.bailian.service.product.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(Integer id);

    int update(User user);

    int saveOrUpdate(User user);

    int deleteById(Integer id);

}

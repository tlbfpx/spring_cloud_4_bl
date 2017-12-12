package com.bailian.service.product.controller;

import com.bailian.service.product.model.User;
import com.bailian.service.product.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> getAll() {
        logger.info("开始查询所有用户......");
        List<User> users = userService.getAll();
        logger.info("结束查询所有用户......");
        return users;
    }

    @RequestMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        logger.info("开始查询" + id +"用户......");
        User user = userService.getById(id);
        logger.info("结束查询" + id +"用户......");
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="create a user ", notes="new user")
    @ApiImplicitParam(name = "user", value = "userBean", required = true, dataType = "User")
    public User saveOrUpdate(@RequestBody User user) {
        logger.info("开始更新" + user.getUsername() +"用户......");
        userService.saveOrUpdate(user);
        logger.info("结束更新" + user.getUsername() +"用户......");
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int deleteById(@PathVariable Integer id) {
        logger.info("开始删除" + id +"用户......");
        return userService.deleteById(id);
    }
}

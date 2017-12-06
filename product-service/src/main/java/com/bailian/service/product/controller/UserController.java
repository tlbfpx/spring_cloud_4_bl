package com.bailian.service.product.controller;

import com.bailian.service.product.model.User;
import com.bailian.service.product.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> getAll() {
        List<User> users = userService.getAll();
        return users;
    }

    @RequestMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        User user = userService.getById(id);
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="create a user ", notes="new user")
    @ApiImplicitParam(name = "user", value = "userBean", required = true, dataType = "User")
    public User saveOrUpdate(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int deleteById(@PathVariable Integer id) {
        return userService.deleteById(id);
    }
}

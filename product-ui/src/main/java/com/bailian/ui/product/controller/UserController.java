package com.bailian.ui.product.controller;

import com.alibaba.fastjson.JSON;
import com.bailian.ui.product.model.User;
import com.bailian.ui.product.proxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private  ProductServiceProxy productService;

    @RequestMapping("/product/user")

    public ModelAndView getAllUser(){
       String result =  productService.getAll();
        List<User> userList = JSON.parseArray(result, User.class);
        ModelAndView modelAndView = new ModelAndView("user-list");
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }

    @RequestMapping("/product/user/{id}")
    public ModelAndView getById(@PathVariable("id") Integer id){
        String result =  productService.getById(id);
        User user = JSON.parseObject(result,User.class);
        ModelAndView modelAndView = new ModelAndView("user-search");
        modelAndView.addObject("user", user);
        System.out.println(user.toString());
        return modelAndView;
    }

    @RequestMapping("/product/user2")
    public ModelAndView getAllUser2(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForEntity("http://10.202.161.200:9999/product/user",String.class).getBody();
        List<User> userList = JSON.parseArray(result, User.class);
        ModelAndView modelAndView = new ModelAndView("/user-list");
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }
}

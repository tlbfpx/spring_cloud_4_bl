package com.bailian.service.product.controller;

import com.bailian.service.product.model.User;
import com.bailian.service.product.proxy.ProductServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/productClient")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private ProductServiceProxy productService;

    @RequestMapping("/user")
    public List<User> getAllUser() {
        Long start = System.currentTimeMillis();
        logger.info("search all user start" + System.currentTimeMillis());
        List<User> list =  productService.getAll();
        Long end = System.currentTimeMillis();
        logger.info("search all user end" + end);
        logger.info("cost: " + (end - start) + "ms");
        return list;

    }

    @RequestMapping("/user/{id}")
    public User getById(@PathVariable("id") Integer id) {

        Long start = System.currentTimeMillis();
        logger.info("search all user start" + System.currentTimeMillis());
        try {
            Random rand = new Random();
            long wait = rand.nextInt(5);
            Thread.sleep(wait * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long end = System.currentTimeMillis();
        logger.info("search all user end" + end);
        logger.info("cost: " + (end - start) + " ms ");
        return productService.getById(id);

    }


    public static void main(String args[]) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(5));
        }
    }

}

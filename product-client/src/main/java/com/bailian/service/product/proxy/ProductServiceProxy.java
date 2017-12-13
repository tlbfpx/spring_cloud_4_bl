package com.bailian.service.product.proxy;


import com.bailian.service.product.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "product-service",fallback = ProductServiceFallback.class)

public interface ProductServiceProxy {

    @RequestMapping("/user")
    List<User> getAll() ;

    @RequestMapping("/user/{id}")
    User getById(@PathVariable("id") Integer id);

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    User saveOrUpdate(@RequestBody User user) ;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    int deleteById(@PathVariable("id") Integer id);
}

@Component
class ProductServiceFallback implements  ProductServiceProxy{
    private Logger logger = LoggerFactory.getLogger(ProductServiceFallback.class);
    @Override
    public List<User> getAll() {
        logger.info("call getAll@product-service error");
        return new ArrayList<User>();
    }

    @Override
    public User getById(Integer id) {
        logger.info("call getById@product-service error");
        return new User();
    }

    @Override
    public User saveOrUpdate(User user) {
        logger.info("call saveOrUpdate@product-service error");
        return new User();
    }

    @Override
    public int deleteById(Integer id) {
        logger.info("call deleteById@product-service error");
        return -1;
    }
}


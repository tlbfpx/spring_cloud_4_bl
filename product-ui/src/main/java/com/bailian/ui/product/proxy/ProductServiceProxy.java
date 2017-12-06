package com.bailian.ui.product.proxy;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service")
@Service
public interface ProductServiceProxy {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);

    @RequestMapping("/user")
    String getAll() ;

    @RequestMapping("/user/{id}")
    String getById(@PathVariable("id") Integer id);
}

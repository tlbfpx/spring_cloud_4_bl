package com.bailian.service.product.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class HelloController {

    @Value("${hello}")
    private String hello;

    @Autowired
    private DiscoveryClient client;


    @GetMapping("/hello/{name}")
    @ApiOperation(value = "hello,body", notes = "hello")
    @ApiImplicitParam(name = "name", value = "jack", required = true, dataType = "String")
    public String hello(@PathVariable String name) {
        ServiceInstance instance = client.getLocalServiceInstance();

        return instance.getHost() + ":" + instance.getPort() + "   " + hello + "," + name;
    }


}

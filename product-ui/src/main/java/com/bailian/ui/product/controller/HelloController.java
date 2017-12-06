package com.bailian.ui.product.controller;

import com.bailian.ui.product.proxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private ProductServiceProxy productService;

    @RequestMapping("/hello")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","this is a test");
        return "hello";
    }


    @RequestMapping("/hello/{name}")
    ModelAndView hello(@PathVariable String name){
        ModelAndView modelAndView = new ModelAndView("hello");
        String result = productService.hello(name);
        modelAndView.addObject("result", result);
        return  modelAndView;
    }
}

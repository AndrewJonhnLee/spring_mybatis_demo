package com.cool.amoy.controller;


import com.cool.amoy.jpa.HelloRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyHelloController {


    private Logger logger = LoggerFactory.getLogger(getClass());

//    @Value("${spring.datasource.username}")
//    private String name;

//    @Autowired
//    private HelloRepository repository;

//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    @ResponseBody
//    public String index() {
//
//        return "hello!";
//    }
}

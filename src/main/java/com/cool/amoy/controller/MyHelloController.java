package com.cool.amoy.controller;


import com.cool.amoy.jpa.HelloRepository;
import com.cool.amoy.model.Entity.HelloModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyHelloController {


    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private HelloRepository helloRepository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String index() {
        helloRepository.findOne(1L);
        return "hello!";
    }


    @RequestMapping(value = "test", method = RequestMethod.POST)
    public HelloModel test() {
        return new HelloModel(1112,"thy");
    }



    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String web() {
        return "pccx";
    }


}

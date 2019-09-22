package com.zime;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @RequestMapping(value = "/sayHello/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name){
        System.out.println("serviceA");
        return "{'msg': 'hello, " + name + "'}";
    }
}
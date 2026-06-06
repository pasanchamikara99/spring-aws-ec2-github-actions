package org.mc.bookshop.springbootawstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aws")
public class HelloController {


    @GetMapping
    public String sayHello() {
        return "This is AWS Test Server";
    }
}

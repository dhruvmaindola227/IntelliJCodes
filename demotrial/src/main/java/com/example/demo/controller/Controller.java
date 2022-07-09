package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
//very basic rest api.
@RestController
@RequestMapping(path = "/FirstDemo")

public class Controller {
    @GetMapping(path = "/get")
    public @ResponseBody
    String getString(@RequestBody String str){
        System.out.println(str);
        return str + " get method called";

    }

    @GetMapping(path = "/post")
    public @ResponseBody
    String postString(@RequestBody String str){
        System.out.println(str);
        return str + " post method called";
    }
}

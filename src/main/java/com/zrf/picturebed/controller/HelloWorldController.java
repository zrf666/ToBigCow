package com.zrf.picturebed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fafa
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String HelloWorld(){
        return "HelloWorld!";
    }
}

package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StartController {


    @GetMapping("/")
    String getRootURL() {

        return "Hello World";
    }
        @GetMapping("/main")
        String getRootURLmain()
        {

            return "Hello Nataly";


    }
}

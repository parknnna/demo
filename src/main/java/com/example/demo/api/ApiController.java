package com.example.demo.api;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public HashMap<String,String> hello() {
        HashMap<String,String> result = new HashMap<>();
        result.put("message", "123123");

        return result;
    }
}

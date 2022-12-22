package com.example.Pro01.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/api/v1/EnterPgController")
@RequestMapping("/api/v1/EnterPgController")
public class EnterPgController {

    @GetMapping(value = "/apple")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }
}

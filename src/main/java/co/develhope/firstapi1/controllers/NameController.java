package co.develhope.firstapi1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String nome(){
        return "Giuseppe";
    }
    @PostMapping("/name")
    public String nome2(){
        StringBuilder stringBuilder= new StringBuilder("Giuseppe");
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

}
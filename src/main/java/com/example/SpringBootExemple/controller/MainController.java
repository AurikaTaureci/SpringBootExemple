package com.example.SpringBootExemple.controller;

import com.example.SpringBootExemple.model.Laptop;
import com.example.SpringBootExemple.service.LaptopService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class MainController {


    private LaptopService laptopService;

    public MainController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Buna ziua miercuri!";
    }

    @RequestMapping("/bye")
    public String bye(){
        return "bye.html";
    }

    @GetMapping("/laptop")
    @ResponseBody
    public List<Laptop> getLaptop(){
        return laptopService.getLaptops();
    }
}

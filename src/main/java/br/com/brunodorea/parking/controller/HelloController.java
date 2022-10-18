package br.com.brunodorea.parking.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Hidden
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello DIO... Java Dev!!!";
    }
}
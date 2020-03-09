package com.dg.dndartifact.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> test() {

        System.out.println("Called");
        return new ResponseEntity<>(
                "No Database connection",
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}

package org.example.controller;

import org.example.exception.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin") //route untuk admin

public class AdminController {
    @GetMapping
    public String getAdmin() {
        return "Admin route OK";
    }
}



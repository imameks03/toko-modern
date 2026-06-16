package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/tes")
    public String tes() {
        return "api/tes OK";
    }

}
//jika tidak ditemukan route yang sesuai, maka akan mengembalikan error 404 Not Found





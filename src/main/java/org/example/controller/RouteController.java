package org.example.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class RouteController {

    //add kategoriData
    private final List<String> kategoriData = Arrays.asList("umum", "elektronik", "pakaian", "makanan");

    @GetMapping("/tes/{id}")
    public String getRouteTes(@PathVariable String id) {
        return "api/tes/" + id + " OK";
    }

    @GetMapping("/tes")
    public String getRouteTesWithParams(
            @RequestParam(name = "kategori", required = false) String kategori) {
        // Jika user memasukkan query ?kategori=nilai
        if (kategori != null) {

            for (String k : kategoriData) {
                if (k.equals(kategori)) {
                    return "api/tes/" + k + " OK";
                }else {
                    return "api/tes/" + k + " NOT OK";
                }
            }

        }

        // Jika user hanya mengakses /api/tes biasa tanpa parameter
        return "api/tes OK";
    }
}







package com.app.api.pruebas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controllerprueba {
@GetMapping("index")
    public String index(){
        return "funciona esta mierda";
    }
}

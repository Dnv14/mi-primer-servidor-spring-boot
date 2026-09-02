package com.example.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // registramos clase como el controlador http
@RequestMapping("/api") //prefijo de las rutas
public class HelloController {
    @GetMapping("/hello")
    public String hello(){return "Hola desde Springbot";}

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "hola " + nombre ;
    }

}

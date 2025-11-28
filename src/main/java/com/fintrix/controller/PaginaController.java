package com.fintrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String inicio() {
        return "Pcontrol_finanzas";  // Nombre del HTML sin .html
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro_usuario";
    }

    @GetMapping("/ingresos")
    public String ingresos() {
        return "Tingresos";
    }

    @GetMapping("/movimientos")
    public String movimientos() {
        return "Movimientos";
    }

    @GetMapping("/egresos")
    public String egresos() {
        return "Pcontrol_egreso";
    }
}
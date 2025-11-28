package com.fintrix.fintrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PaginaController {
    
    // Metodo GET para abrir los html 
    @GetMapping("/")
    public String inicio() {
        return "Pcontrol_finanzas"; // Nombre del html sin  .html
    }
    
    @GetMapping("/registro")
    public String registro() {
        return "registro_usuario"; // Nombre del html sin  .html
    }

    @GetMapping("/ingresos")
    public String ingresos() {
        return "Tingresos"; // Nombre del html sin  .html
    }

    @GetMapping("/movimientos")
    public String movimientos() {
        return "Movimientos"; // Nombre del html sin  .html
    }

    @GetMapping("/egresos")
    public String egresos() {
        return "Pcontrol_egreso"; // Nombre del html sin  .html
    }
}

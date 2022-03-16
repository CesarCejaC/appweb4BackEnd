package controllers;

import entities.Juego;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.JuegoService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1")
public class JuegoController {

    @Resource
    private JuegoService juegoService;

    @RequestMapping("/save")
    public String save(){
        Juego d = new Juego();
        d.setNombreJuego("Elden Ring");
        d.setDescripcionJuego("Esta Joya");
        juegoService.save(d);
        return "Juego guardado";
    }

    @GetMapping("/juegos")
    public void viewAll() {
    }
}

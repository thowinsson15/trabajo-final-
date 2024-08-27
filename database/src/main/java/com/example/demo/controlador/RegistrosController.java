package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Registros;
import com.example.demo.service.RegistrosService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/registros")

public class RegistrosController {

    @Autowired
    private RegistrosService registrosService;

    @GetMapping
    public List<Registros> getRegistros() {
		return null;
        // Lógica para devolver los registros
    }
   

    // Método para agregar un nuevo registro
    @PostMapping
    public Registros crearRegistro(@RequestBody Registros registro) {
        return registrosService.crearRegistro(registro);
    }
}



    


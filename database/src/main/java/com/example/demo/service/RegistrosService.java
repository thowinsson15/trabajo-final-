package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controlador.RegistrosController;
import com.example.demo.modelo.Registros;  // Importa la entidad correcta
import com.example.demo.repositorio.Registros.RegistrosRepository;

@Service
public class RegistrosService {

    @Autowired
    private RegistrosRepository registrosRepository;


    // Método para crear un nuevo registro
    public Registros crearRegistro(Registros registro) {
        return registrosRepository.save(registro);  // El repositorio guarda la entidad 'Registros'
    }
}

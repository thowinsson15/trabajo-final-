package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Registros;
import com.example.demo.repositorio.Registros.RegistrosRepository;


@Service
public class LoginService {

    @Autowired
    private RegistrosRepository registrosRepository;

    public boolean validateLogin(String email, String contrasena) {
        Registros user = registrosRepository.findByEmailAndContrasena(email, contrasena);
        return user != null; // Retorna true si las credenciales son correctas
    }
}

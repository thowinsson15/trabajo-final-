package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.LoginService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:4200") // Permitir solicitudes desde Angular
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Map<String, Object> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String contrasena = loginData.get("contrasena");

        Map<String, Object> response = new HashMap<>();

        if (loginService.validateLogin(email, contrasena)) {
            response.put("success", true);
            response.put("message", "Inicio de sesión exitoso");
        } else {
            response.put("success", false);
            response.put("message", "Credenciales incorrectas");
        }

        return response;
    }
}

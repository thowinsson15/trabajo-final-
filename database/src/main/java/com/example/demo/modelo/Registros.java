package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Registros {

    @Id
    @Column(name ="employeed_code",length = 50, unique = true) 
    private String employeed_code;
    
	

    @Column(name ="email",length = 50,unique = true) // El correo será único
    private String email;
    
    @Column(name ="contrasena",length = 50, nullable = false)
    private String contrasena;

	public Registros() {
		super();
	}

	public Registros(String employeed_code, String email, String contrasena) {
		super();
		this.employeed_code = employeed_code;
		this.email = email;
		this.contrasena = contrasena;
	}

	public String getEmployeed_code() {
		return employeed_code;
	}

	public void setEmployeed_code(String employeed_code) {
		this.employeed_code = employeed_code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}

    
    

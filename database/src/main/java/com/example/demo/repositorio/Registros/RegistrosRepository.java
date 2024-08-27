package com.example.demo.repositorio.Registros;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.modelo.Registros;  // Asegúrate de que esté apuntando a la entidad correcta

public interface RegistrosRepository extends JpaRepository<Registros, String> {
	Registros findByEmailAndContrasena(String email, String contrasena);
}

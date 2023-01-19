package com.Biblioteca.Prestamos.Respositorio;

import com.Biblioteca.Prestamos.Entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianteRepositorio extends JpaRepository<Estudiante, String>{

}

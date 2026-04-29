package com.valledelsol.usuarios_service.repository;


import com.valledelsol.usuarios_service.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo  extends JpaRepository<Usuario, Long> {
}

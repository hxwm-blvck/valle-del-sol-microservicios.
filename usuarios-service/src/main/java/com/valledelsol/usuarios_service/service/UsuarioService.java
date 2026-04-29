package com.valledelsol.usuarios_service.service;


import com.valledelsol.usuarios_service.model.Usuario;
import com.valledelsol.usuarios_service.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepository;

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario guardar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}

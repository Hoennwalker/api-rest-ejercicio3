package com.formacionspring.app.apirest.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.formacionspring.app.apirest.entity.Usuarios;

public interface UsuarioService 
{
	public List <Usuarios> findAll(); 
	public Usuarios login(String usuarioPost, String contraseña);
}

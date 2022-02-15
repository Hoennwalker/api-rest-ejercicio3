package com.formacionspring.app.apirest.service;

import java.util.List;

import com.formacionspring.app.apirest.entity.Usuarios;

public interface UsuarioService 
{
	public List <Usuarios> findAll(); 
	public Usuarios login(Usuarios usuario);
}

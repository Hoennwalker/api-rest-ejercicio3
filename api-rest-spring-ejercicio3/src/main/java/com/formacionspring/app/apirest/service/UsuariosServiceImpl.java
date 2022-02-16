package com.formacionspring.app.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspring.app.apirest.dao.UsuariosDao;
import com.formacionspring.app.apirest.entity.Usuarios;

@Service
public class UsuariosServiceImpl implements UsuarioService 
{
	@Autowired
	private UsuariosDao usuarioDao;

	@Override
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios login(String usuarioPost, String contraseña) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

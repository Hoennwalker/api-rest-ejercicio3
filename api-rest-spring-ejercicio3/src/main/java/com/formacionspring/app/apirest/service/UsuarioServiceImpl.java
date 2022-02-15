package com.formacionspring.app.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspring.app.apirest.dao.UsuariosDao;
import com.formacionspring.app.apirest.entity.Usuarios;

@Service
public class UsuarioServiceImpl implements UsuarioService 
{
	@Autowired
	private UsuariosDao usuarioDao;

	@Override
	public Usuarios login(Usuarios usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

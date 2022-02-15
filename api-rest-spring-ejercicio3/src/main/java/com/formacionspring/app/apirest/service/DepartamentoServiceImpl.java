package com.formacionspring.app.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.formacionspring.app.apirest.dao.DepartamentoDao;

import com.formacionspring.app.apirest.entity.Departamento;


@Service
public class DepartamentoServiceImpl implements DepartamentoService
{
	@Autowired
	private DepartamentoDao departamentoDao;

	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamento>) departamentoDao.findAll();
	}

	@Override
	public Departamento findById(Long id) {
		// TODO Auto-generated method stub
		return departamentoDao.findById(id).orElse(null);
	}

	@Override
	public Departamento save(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDao.save(departamento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		departamentoDao.deleteById(id);
	}

	


	

}

package com.formacionspring.app.apirest.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.app.apirest.entity.Departamento;
import com.formacionspring.app.apirest.entity.Jefe;

@Repository
public interface JefeDao extends CrudRepository<Jefe, Long>{

	@Query("from Departamento")
	public List<Departamento> findAllDepartamentos();
}

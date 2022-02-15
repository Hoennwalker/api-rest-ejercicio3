package com.formacionspring.app.apirest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.formacionspring.app.apirest.entity.Usuarios;
import com.formacionspring.app.apirest.entity.Departamento;
@Repository
public interface UsuariosDao extends CrudRepository<Usuarios, Long>{

}

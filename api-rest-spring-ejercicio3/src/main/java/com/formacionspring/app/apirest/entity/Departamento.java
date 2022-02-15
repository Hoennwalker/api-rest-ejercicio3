package com.formacionspring.app.apirest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name="departamentos")
public class Departamento implements Serializable 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int departamento_id; 
	
	@Column(nullable=false, unique = true)//con esto conseguimos que los atributos no puedan ser nulos
	private String nombre;
	
	private String ubicacion;
	
	
	
	public int getCodDepartamento() {
		return departamento_id;
	}



	public void setCodDepartamento(int departamento_id) {
		this.departamento_id = departamento_id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

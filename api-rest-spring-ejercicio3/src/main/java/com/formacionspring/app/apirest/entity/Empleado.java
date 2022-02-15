package com.formacionspring.app.apirest.entity;

import java.io.Serializable;

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
@Table( name="empleados")
public class Empleado implements Serializable{

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private int codEmpleado; 
		
		@Column(nullable=false, unique = true)//con esto conseguimos que los atributos no puedan ser nulos
		private String dni;
		
		private String nombre;
		private int salario;
		private int telefono;
		
		@ManyToOne(fetch= FetchType.LAZY)
		@JoinColumn(name="departamento_id")
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Departamento cod_departamento;
		
		public int getCodEmpleado() {
			return codEmpleado;
		}



		public void setCodEmpleado(int codEmpleado) {
			this.codEmpleado = codEmpleado;
		}







		public String getDni() {
			return dni;
		}







		public void setDni(String dni) {
			this.dni = dni;
		}







		public String getNombre() {
			return nombre;
		}







		public void setNombre(String nombre) {
			this.nombre = nombre;
		}







		public int getSalario() {
			return salario;
		}







		public void setSalario(int salario) {
			this.salario = salario;
		}







		public int getTelefono() {
			return telefono;
		}







		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}






		public Departamento getIdDep() {
			return cod_departamento;
		}



		public void setIdDep(Departamento idDep) {
			cod_departamento = idDep;
		}






		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}

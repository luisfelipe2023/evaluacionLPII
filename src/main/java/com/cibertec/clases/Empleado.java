package com.cibertec.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idEmpleado;
	public String apellidos;
	public String nombres;
	public int edad;
	public String sexo;
	public double salario;
	
	
	public Empleado() {
		
	}
	public Empleado(int idEmpleado, String apellidos, String nombres, int edad, String sexo, double salario) {
		super();
		this.idEmpleado = idEmpleado;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}

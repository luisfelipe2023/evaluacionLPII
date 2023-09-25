package com.cibertec.interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.clases.Empleado;
	@Repository
	public interface IEmpleado extends CrudRepository<Empleado, Integer> {

	
    
	}

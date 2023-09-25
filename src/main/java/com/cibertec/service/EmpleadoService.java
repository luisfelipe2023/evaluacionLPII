package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.cibertec.clases.Empleado;
import com.cibertec.interfaceService.IempleadoService;
import com.cibertec.interfaces.IEmpleado;

@Service
public class EmpleadoService implements IempleadoService {
	@Autowired
	private IEmpleado data;
	@Override
	public List<Empleado> listar() {
		
		return (List<Empleado>)data.findAll();
	}

	
	
	@Override
	public void eliminar(int id) {
	   data.deleteById(id);
	}



	@Override
	public int save(Empleado e) {
		int res=0;
		Empleado empleado =data.save(e);
		if(!empleado.equals(null)) {
			res=1;
		}
		return 0;
	}



	@Override
	public Optional<Empleado> buscarPorId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}









	
	

}

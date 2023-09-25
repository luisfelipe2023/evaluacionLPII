package com.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;

import com.cibertec.clases.Empleado;

public interface IempleadoService {
	//METODO PARA LISTAR
	public List<Empleado>listar();
	//METODO PARA GUARDAR
	public int save(Empleado e);
	//METODO PARA ELIMINAR
	 public void eliminar(int id);
	 //METODO PARA REALIZAR UNA BUSQUEDA POR ID
	 public Optional<Empleado> buscarPorId(int id);
}

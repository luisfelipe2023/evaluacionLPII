package com.cibertec.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.clases.Empleado;
import com.cibertec.interfaceService.IempleadoService;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;


@Controller
@RequestMapping
public class ControladorEmpleados {
	@Autowired
	private IempleadoService service;
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado>empleados = service.listar();
		model.addAttribute("empleados",empleados);
		return "lista";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("empleado",new Empleado());
		return "insertar";
	}
	@PostMapping("/save")
	public String save(@Validated Empleado e , Model model) {
		service.save(e);
		return "redirect:/listar";	
	}
	@GetMapping("/editar/{id}")
	public String editarEmpleado(@PathVariable int idEmpleado , Model model) {
		Optional<Empleado> empleado=service.buscarPorId(idEmpleado);
		model.addAttribute("empleado",empleado);
		return "editar";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model ,@PathVariable int id) {
		service.eliminar(id);
		return "redirect:/listar";
	}
	

	
	
	
}

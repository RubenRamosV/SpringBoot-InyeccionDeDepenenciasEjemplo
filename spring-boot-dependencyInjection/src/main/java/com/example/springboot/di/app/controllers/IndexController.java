package com.example.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.di.app.model.service.IServicio;

@Controller
public class IndexController {

	/*
	 * Aqui se hace una inyeccion por parcial, dado que el metodo operacion
	 * pertenece a una sola clase. No obstante, si implementamos una interface
	 * varias clases pueden tener el mismo metodo y la inyeccion seria total
	 * 
	 * @Autowired MiServicio miServicio;
	 */

	/*
	 * Se crea una interface y se manda a llamar el metodo opercion desde la
	 * interfaz, ahora si existe un desacoplamiento total de la clase inyectada.
	 * 
	 * IServicio servicio;
	 * 
	 * Existen dos clases que implementan la misma interfaz, miServicioComplejo y MiServicio,
	 * spring no sabe que clase inyectar, por lo que se agrega la anotacion primary al
	 * servicio complejo y ese se inyecta por default. No obstante, si en algun lugar de 
	 * la aplicacion, debemos utiliza la otra case, se anade la anotacion qualifier para
	 * indicar a spring que en ese lugar, inyecte una clase en especifico. 
	 */
	@Autowired
	@Qualifier("miServicioSimple")
	IServicio servicio;

	@GetMapping({ "/", "/index", "" })
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}


	
	
	
	
	
	
	
	
	
	
	
	

}

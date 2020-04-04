package com.example.springboot.di.app.model.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio{

	//Todo componente de spring debe de tener un constructor generico, sin argumentos.
	
	@Override
	public String operacion() {
		return "Ejecutando alguna accion simple... Ejemplo";
	}
	
}

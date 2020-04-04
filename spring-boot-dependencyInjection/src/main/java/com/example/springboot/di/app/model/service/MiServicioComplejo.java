package com.example.springboot.di.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 Existen dos clases que implementan la misma interfaz, por lo que spring no sabe que clase
 inyectar. Para solucionar el problema, se marca una clase con la anotacion primary, 
 y esa sera la principal que va a inyectar spring.
 */

@Primary
@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion() {
		return "Ejecutando alguna accion complicada... ejemplo";
	}
	
}

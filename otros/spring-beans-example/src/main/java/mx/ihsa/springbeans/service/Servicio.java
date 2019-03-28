package mx.ihsa.springbeans.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;


import mx.ihsa.springbeans.repositorio.Repositorio;


public class Servicio {

	@Autowired
	private Repositorio repositorio;
	
	private String mensaje;

	@PostConstruct
	public void init() {
		// TODO Auto-generated constructor stub
		System.out.print("Hola estas en el servicio");
		
	 repositorio.getDatos()
	 .stream()
	 .forEach(e->{
		 System.out.print(e);
	 });
		
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}

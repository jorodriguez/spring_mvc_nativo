package mx.ihsa.integracion.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import mx.ihsa.integracion.webservice.UsuariosWebservice;
import mx.ihsa.integracion.webservice.UsuariosWebserviceService;

@Named
public class ValidarEmailBean {
		
	private String email = "Holllllla";
	
	
	public void validaMail() {
		
		UsuariosWebservice usuariosWebservice = new UsuariosWebserviceService().getUsuariosWebservicePort();
		System.out.println("En el metodo");	
		
		boolean r = usuariosWebservice.validarEmail(email);
		
		if(r) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Encontrado"));
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("UUPS¡¡¡ NO Encontrado"));
		}		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	
	

	
	
}

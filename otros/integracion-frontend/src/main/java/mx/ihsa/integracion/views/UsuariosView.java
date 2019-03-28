package mx.ihsa.integracion.views;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import mx.ihsa.integracion.webservice.Usuario;
import mx.ihsa.integracion.webservice.UsuariosWebservice;
import mx.ihsa.integracion.webservice.UsuariosWebserviceService;

@Named
public class UsuariosView {

	private String email = "Usuario iniciado";
	private Usuario usuario;
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	@PostConstruct
	private void init() {
		setUsuario(new Usuario());
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public void validarEmail() {
		UsuariosWebservice servicio = new UsuariosWebserviceService().getUsuariosWebservicePort();
		boolean existe = servicio.validarEmail(getEmail());
		
		if(existe) {
			//usuario = servicio.buscarPorId(1);
		}

		FacesMessage mensaje = 
				new FacesMessage(
						FacesMessage.SEVERITY_INFO, 
						existe?"El correo ya existe":"El correo no existe", 
								email
						);

		FacesContext.getCurrentInstance().addMessage(null,  mensaje);
	}

}

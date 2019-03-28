package mx.ihsa.integracion.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.ihsa.integracion.service.UsuarioService;

@Component
@WebService
public class UsuariosWebservice {

	@Autowired
	private UsuarioService usuarioService;
	
	@WebMethod
	public boolean validarEmail(String email) {
		return usuarioService.validarEmail(email) != null;
	}
}

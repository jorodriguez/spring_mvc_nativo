package mx.ihsa.integracion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ihsa.integracion.service.UsuarioService;

@RestController
public class UsuariosRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/usuarios/{email}", method=RequestMethod.GET)
	public boolean validarEmail(@PathVariable("email") String email) {
		return usuarioService.validarEmail(email) != null;
	}
}

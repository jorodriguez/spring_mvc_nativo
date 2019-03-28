package mx.ihsa.soap.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.ihsa.soap.model.Perfil;
import mx.ihsa.soap.service.PerfilService;

@Component
@WebService
public class PerfilWebservice {
	
	@Autowired
	private PerfilService perfilService;
	
	@WebMethod
	public void insertar(Perfil perfilParam) {
		perfilService.insertar(perfilParam);
	}
	
	
	@WebMethod
	public List<Perfil> listar(){		
		return perfilService.listar();
		
	}
	
	
}

package mx.ihsa.soap.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component //Importante para que lo reconosca Spring en inyecciones y uso
@WebService
public class ServicioWeb {	
	
	@WebMethod
	public String saludar() {
		return "Hola esto es un saludo desde un WS";		
	}	

}

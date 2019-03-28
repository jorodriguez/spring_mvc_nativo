package mx.ihsa.soap.webservice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServicioWebTest {

	@Test
	public void testSaludar() {
		ServicioWeb servicio = new ServicioWebService().getServicioWebPort();
		
		String respuesta = servicio.saludar();
		
		assertTrue(respuesta.equals("Implementación Hola esto es un saludo desde un WS"));	
			
		
		//fail("Not yet implemented");
	}

}

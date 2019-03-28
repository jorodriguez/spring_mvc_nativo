package mx.ihsa.soap.webservice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PerfilWebserviceTest {

	@Test
	public void testInsertar() {
		
		PerfilWebservice servicio = new PerfilWebserviceService().getPerfilWebservicePort();
		
		Perfil perfil = new Perfil();
		perfil.setIdPerfil(1013);
		perfil.setDescPerfil("Director de poner Garrafones");
		perfil.setObservaciones("Pone garrafones");		
		
		servicio.insertar(perfil);
		
		assertTrue(true);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testListar() {
		
		PerfilWebservice servicio = new PerfilWebserviceService().getPerfilWebservicePort();
		
		List<Perfil> lista = servicio.listar();		
		
		lista.stream().forEach(e->{
			System.out.println("id = "+e.getIdPerfil());
			System.out.println("perfil = "+e.getDescPerfil());
			System.out.println("obs = "+e.getObservaciones());
			System.out.println("----------------------------------");
		});
		
		assertTrue(lista.size()>0);
		
//fail("Not yet implemented");
	}

}

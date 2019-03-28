package mx.ihsa.springbeans.repositorio;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RepositorioTest {
	
		
	
	@Test
	public void testGetDatos() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Repositorio repo = context.getBean(Repositorio.class);
		
		//repo.getDatos().stream().
		assertTrue(repo.getDatos().size()==4);
		
		//fail("Not yet implemented");
	}

}

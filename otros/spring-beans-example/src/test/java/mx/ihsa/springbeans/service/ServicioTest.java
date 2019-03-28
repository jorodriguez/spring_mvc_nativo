package mx.ihsa.springbeans.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServicioTest {
		
	@Test
	public void testServicio() throws BeansException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Servicio servicio = (Servicio) context.getBean("servicio_prueba");
		
		assertTrue(servicio.getMensaje().equals("Hola mundo"));
		
		
		servicio.setMensaje("hola");	
		
		System.out.print("---> "+servicio.getMensaje());
		
		//fail("Not yet implemented");
	}

}

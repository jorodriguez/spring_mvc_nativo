package mx.ihsa.integracion.views;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.ihsa.integracion.webservice.TipoMovimientoWebservice;

@Named
public class TipoMovimientoBean {		
		
	@Autowired
	private TipoMovimientoWebservice servicioMovimiento;
	
	
	@PostConstruct
	private void init() {
		
		
	}
	
	
}

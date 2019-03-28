package mx.ihsa.integracion.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import mx.ihsa.integracion.rest.TipoMovimientoRestClient;
//import mx.ihsa.integracion.model.Tipomovimiento;
import mx.ihsa.integracion.webservice.TipoMovimientoWebservice;
import mx.ihsa.integracion.webservice.TipoMovimientoWebserviceService;
import mx.ihsa.integracion.webservice.Tipomovimiento;

@Named
public class TipoMovimientoBean {		
		
	//@Autowired
	private TipoMovimientoWebservice servicioMovimiento;
	
	private TipoMovimientoRestClient clienteRest;
	
	private Tipomovimiento seleccion;
	private List<Tipomovimiento> lista;
	
	@PostConstruct
	private void init() {		
		this.servicioMovimiento = new TipoMovimientoWebserviceService().getTipoMovimientoWebservicePort();
		this.clienteRest = new TipoMovimientoRestClient();
		traerDatos();
	}
	
	public void iniciarNuevo(ActionEvent  e) {
		this.seleccion = new Tipomovimiento();
	}
	
	public void iniciarModificar(ActionEvent  e) {
		System.out.println("====="+this.seleccion.getIdTipMov());
		 
	}
		
	public void guardar(ActionEvent e) {			
		servicioMovimiento.guardar(seleccion);
		traerDatos();
	}	
		
	public void eliminar(ActionEvent e) {		
		servicioMovimiento.eliminar(this.seleccion.getIdTipMov());
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(
							FacesMessage.SEVERITY_INFO, "Eliminado", "Se eliminó")
				);		   
		traerDatos();
	}
	
	public void modificar(ActionEvent e) {		
		clienteRest.guardar(seleccion);
		FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(
									FacesMessage.SEVERITY_INFO, "Modificado", "Se modificó")
						);		   
		traerDatos();
	}
		
	
	private void traerDatos() {
		//this.lista = servicioMovimiento.getLista();
		this.lista = clienteRest.getMovimientos();
	}
	
	
	public Tipomovimiento getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(Tipomovimiento seleccion) {
		this.seleccion = seleccion;
	}
	
	
	public List<Tipomovimiento> getLista(){
		return lista;		
	}	
}

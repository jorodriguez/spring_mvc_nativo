package mx.ihsa.primefaces;

import java.util.Date;
import java.util.EventListener;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

@Named
public class CalendarBean {

	
	private String[] efectos = {"blind","bounce","clip",
			"drop","explode","fade","fold","highlight",
			"puff","pulsate","scale","shake","size","slide",
			"slideDown"};
	

	private Date fechaSeleccionada;
	
	@PostConstruct
	private void init() {
		this.fechaSeleccionada = new Date(); 
		
	}
	
	public void seleccionarFecha(SelectEvent e) {
		FacesMessage f = new FacesMessage(
				FacesMessage.SEVERITY_INFO,
				"Fecha seleccionada ",
				fechaSeleccionada.toString()				
				);
		
		FacesContext.getCurrentInstance().addMessage(null, f);
				
	}
	
	public Date getFechaSeleccionada() {
		return fechaSeleccionada;
	}

	public void setFechaSeleccionada(Date fechaSeleccionada) {
		this.fechaSeleccionada = fechaSeleccionada;
	}

	
	
	public String[] getEfectos() {
		return efectos;
	}

	public void setEfectos(String[] efectos) {
		this.efectos = efectos;
	}
	
}

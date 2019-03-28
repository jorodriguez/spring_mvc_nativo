package mx.ihsa.primefaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;

@Named
public class AutoCompleteBean {
	
	private List<String> lenguajes =  Arrays.asList("java","PHP","Phyton","p");
	
	private List<String> seleccionados = new ArrayList<String>();
	
	
	public List<String> autoCompletar(String filtro){
		
		List<String> resultados= new ArrayList<String>();
		
		
		/*for(String l : lenguajes) {
			if(l.toUpperCase().contains(filtro)) {
				resultados.add(l);
			}			
		}*/
		
		resultados = lenguajes
				.stream()
				.filter(e->{return e.toUpperCase().contains(filtro.toUpperCase());})
				.collect(Collectors.toList());
		
		return resultados;
	}
	
	public List<String> getSeleccionados() {
		return seleccionados;
	}

	public void setSeleccionados(List<String> seleccionados) {
		this.seleccionados = seleccionados;
	}


	
	
}

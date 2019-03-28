package mx.ihsa.springbeans.repositorio;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository //Similar a la declaracion en el Xml  <bean id="repositorio"
public class Repositorio {


	private List<String> datos;
	
	public Repositorio() {
		// TODO Auto-generated constructor stub
		this.datos = new ArrayList<>();
		getDatos().add("Dato 1");
		getDatos().add("Dato 2");
		getDatos().add("Dato 3");
		getDatos().add("Dato 4");	
		
	}

	public List<String> getDatos() {
		return datos;
	}

/*	public void setDatos(List<String> datos) {
		this.datos = datos;
	}*/
	
}

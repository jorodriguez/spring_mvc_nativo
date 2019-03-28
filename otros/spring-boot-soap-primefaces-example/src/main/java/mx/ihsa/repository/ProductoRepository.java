package mx.ihsa.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;


import mx.ihsa.primefaces.model.Producto;

@Repository
public class ProductoRepository {
	
	private List<Producto> listaProducto;
	
	public ProductoRepository() {
		listaProducto = new ArrayList<Producto>();		
		for(int x= 0; x<100;x++) {
			Producto p = new Producto();
			p.setId(x+1);
			BigDecimal precio = new BigDecimal(new Random().nextDouble());				
			
			p.setNombre("producto "+x);
			p.setPrecio(precio);				   		   
		}		
		
	}
	
	public List<Producto> getListaProducto() {
		return listaProducto;
	}
	
}

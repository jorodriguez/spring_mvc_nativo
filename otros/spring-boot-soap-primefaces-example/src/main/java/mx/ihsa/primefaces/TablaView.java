package mx.ihsa.primefaces;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.ihsa.primefaces.model.Producto;
import mx.ihsa.repository.service.ProductoService;

@Named
public class TablaView {
	
	/*@Autowired
	private ProductoService productoService;
	
	private List<Producto> listaProductos;
	
	@PostConstruct
	public void init() {
		listaProductos = productoService.getLista();
	}	
	
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

		*/

}

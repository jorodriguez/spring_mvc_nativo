package mx.ihsa.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ihsa.primefaces.model.Producto;
import mx.ihsa.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	public List<Producto> getLista(){
		return productoRepository.getListaProducto();		
	}
	
}

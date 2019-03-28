package mx.ihsa.integracion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ihsa.integracion.model.Tipomovimiento;
import mx.ihsa.integracion.repository.TipoMovimientoRepository;

@Service
public class TipoMovimientoService {
		
	@Autowired
	private TipoMovimientoRepository tipoMovimientoRepository;
	
	public Integer guardar(Tipomovimiento tipoMovimiento) {
		tipoMovimientoRepository.save(tipoMovimiento);
		return tipoMovimiento.getIdTipMov();
	}
	 
	
	public boolean eliminar(Integer idTipoMovimiento) {
		boolean r=false;
		if(idTipoMovimiento==null) {
			throw new IllegalArgumentException("El id para eliminar es null");
		}
		
		try {
			
			Optional<Tipomovimiento>  opTipoMov = tipoMovimientoRepository.findById(idTipoMovimiento);
			
			if(opTipoMov.isPresent()) {
				tipoMovimientoRepository.delete(opTipoMov.get());
				r=true;
			}							
			
		}catch (Exception e) {
			// TODO: handle exception			
			System.out.println("Excepcion al "+e);
		}
		
		return r;
		
	}
	
	
	public List<Tipomovimiento> getLista(){
		
		//return tipoMovimientoRepository.findAll(Sort.by()))
		return tipoMovimientoRepository.findAll();
	}
	

}


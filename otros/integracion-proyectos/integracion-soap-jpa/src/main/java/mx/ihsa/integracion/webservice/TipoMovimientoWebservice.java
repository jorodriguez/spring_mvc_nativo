package mx.ihsa.integracion.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.ihsa.integracion.model.Tipomovimiento;
import mx.ihsa.integracion.service.TipoMovimientoService;
import mx.ihsa.integracion.service.UsuarioService;

@Component
@WebService
public class TipoMovimientoWebservice {

	@Autowired
	private TipoMovimientoService tipoMovimientoService;
	
	@WebMethod
	public Integer guardar(Tipomovimiento tipoMovimiento) {
		return tipoMovimientoService.guardar(tipoMovimiento);
	}
		
	@WebMethod
	public boolean eliminar(Integer idTipoMovimiento) {
		return tipoMovimientoService.eliminar(idTipoMovimiento);
	}
	
	@WebMethod
	public List<Tipomovimiento> getLista() {
		return tipoMovimientoService.getLista();
	}
	
}

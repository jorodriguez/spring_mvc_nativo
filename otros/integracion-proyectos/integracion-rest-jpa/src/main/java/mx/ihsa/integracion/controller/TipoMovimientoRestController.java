package mx.ihsa.integracion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ihsa.integracion.model.Tipomovimiento;
import mx.ihsa.integracion.service.TipoMovimientoService;


@RestController
public class TipoMovimientoRestController {

	@Autowired
	private TipoMovimientoService tipoMovimientoService;
	
	@RequestMapping(value="/tipo_movimiento/guardar", method=RequestMethod.POST)	
	public ResponseEntity<Integer> guardar(@RequestBody Tipomovimiento tipoMovimiento) {
		
		Integer idTipoMovimientoInsertado = tipoMovimientoService.guardar(tipoMovimiento);
		
		ResponseEntity<Integer> respuesta = new ResponseEntity<Integer>(idTipoMovimientoInsertado, HttpStatus.OK);
		
		return respuesta;
	}
	
	@RequestMapping(value="/tipo_movimiento/eliminar", method=RequestMethod.DELETE)	
	public ResponseEntity<Boolean> eliminar(@RequestBody Integer idTipoMovimiento) {
		
		 boolean respuestaEliminacion = tipoMovimientoService.eliminar(idTipoMovimiento);
		
		ResponseEntity<Boolean> respuesta = new ResponseEntity<Boolean>(respuestaEliminacion, HttpStatus.OK);
		
		return respuesta;
	}
	
	@RequestMapping(value="/tipo_movimiento/listar", method=RequestMethod.GET)	
	public ResponseEntity<List<Tipomovimiento>> getLista() {
		
		List<Tipomovimiento> lista = tipoMovimientoService.getLista();
		
		ResponseEntity<List<Tipomovimiento>> respuesta = new ResponseEntity<List<Tipomovimiento>>(lista, HttpStatus.OK);
		
		return respuesta;
	}
	

	
}

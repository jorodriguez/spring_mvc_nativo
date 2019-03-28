package mx.ihsa.integracion.rest;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mx.ihsa.integracion.webservice.Tipomovimiento;

public class TipoMovimientoRestClient {

	private final ResteasyClient restCliente = new ResteasyClientBuilder().build();
	private final String URL_BASE = "http://localhost:8888/integracion-rest-jpa/tipo_movimiento/";
	private final String URL_GUARDAR = URL_BASE+"guardar";
	private final String URL_LISTAR = URL_BASE+"listar";
		
	public Integer guardar(Tipomovimiento tipoMovimiento) {
		ResteasyWebTarget target = restCliente.target(UriBuilder.fromPath(URL_GUARDAR));
		
		String json = new Gson().toJson(tipoMovimiento);
		
		System.out.println("json "+json);				
		
		Response respuesta = target.request(MediaType.APPLICATION_JSON).post(Entity.json(json));		
	   
		String jsonRespuesta = respuesta.readEntity(String.class);
		
		Integer idRespuesta = new Gson().fromJson(jsonRespuesta, Integer.class);
		
		return idRespuesta;
	}
	
	public List<Tipomovimiento> getMovimientos(){
		
		ResteasyWebTarget target = restCliente.target(UriBuilder.fromPath(URL_LISTAR));			
		
		Response respuesta = target.request(MediaType.APPLICATION_JSON).get();
			   
		String jsonRespuesta = respuesta.readEntity(String.class);	
				
		List<Tipomovimiento> lista = new Gson().fromJson(jsonRespuesta,new TypeToken<List<Tipomovimiento>>(){}.getType());
		
		return lista;
	}
	
	
	
}

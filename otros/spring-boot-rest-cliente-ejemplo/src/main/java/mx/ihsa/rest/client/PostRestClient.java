package mx.ihsa.rest.client;


import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import mx.ihsa.rest.client.model.Post;

public class PostRestClient {
	
	private final String URL = "http://localhost:8080/posts";
	
	private final String URL_INSERTAR = "http://localhost:8080/posts/insertar";
	
	private final String URL_ACTUALIZAR= "http://localhost:8080/posts/actualizar";
	
	private final String URL_ELIMINAR= "http://localhost:8080/posts/eliminar";
	
	private ResteasyClient restCliente = new ResteasyClientBuilder().build();

	public Post insertar(Post post) {
		ResteasyWebTarget target = restCliente.target(UriBuilder.fromPath(URL_INSERTAR));
		
		String json = new Gson().toJson(post);
		
		System.out.println("json "+json);				
		
		Response respuesta = target.request(MediaType.APPLICATION_JSON).post(Entity.json(json));
		
	   
		String jsonRespuesta = respuesta.readEntity(String.class);
		
		Post postRespuesta = new Gson().fromJson(jsonRespuesta, Post.class);
		
		return postRespuesta;
	}
	
	public List<Post> getPosts(){
		
		ResteasyWebTarget target = restCliente.target(UriBuilder.fromPath(URL));			
		
		Response respuesta = target.request(MediaType.APPLICATION_JSON).get();
			   
		String jsonRespuesta = respuesta.readEntity(String.class);
	
				
		List<Post> lista = new Gson().fromJson(jsonRespuesta,new TypeToken<List<Post>>(){}.getType());
		
		return lista;
	}
	
	
	public Post actualizar(Post post){
		
		ResteasyWebTarget target = restCliente.target(UriBuilder.fromPath(URL_ACTUALIZAR));
		
		String json = new Gson().toJson(post);
		
		System.out.println("json actualizar "+json);				
		
		Response respuesta = target.request(MediaType.APPLICATION_JSON).put(Entity.json(json));		
	   
		String jsonRespuesta = respuesta.readEntity(String.class);
		
		Post postModificado = new Gson().fromJson(jsonRespuesta, Post.class);
		
		return postModificado;
	}
	

	public Post eliminar(Integer id){
		
		ResteasyWebTarget target = restCliente.target(UriBuilder.fromPath(URL_ELIMINAR+"/"+id));
		
		//String json = new Gson().toJson(post);
		
		//System.out.println("json actualizar "+json);				
		
		Response respuesta = target.request().delete();		
	   
		String jsonRespuesta = respuesta.readEntity(String.class);
		
		Post postEliminado = new Gson().fromJson(jsonRespuesta, Post.class);
		
		return postEliminado;
	}
	
}

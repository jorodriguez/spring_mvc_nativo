package mx.ihsa.springbootrestejemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ihsa.springbootrestejemplo.model.Post;
import mx.ihsa.springbootrestejemplo.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	@RequestMapping(value="/saludar", method=RequestMethod.GET)
	public String saludar() {
		return "Hola Rest Controller";
	}
	
	@RequestMapping(value="/posts/insertar", method=RequestMethod.POST)
	public ResponseEntity<Post> insertar(@RequestBody Post post) {
		Post postInsertado = postService.guardar(post);
		ResponseEntity<Post> respuesta = new ResponseEntity<Post>(postInsertado, HttpStatus.OK);
		return respuesta;
	}
	
	@RequestMapping(value="/posts/actualizar", method=RequestMethod.PUT)
	public ResponseEntity<Post> modificar(@RequestBody Post post) {
		Post postActualizado = postService.modificar(post);
		ResponseEntity<Post> respuesta = new ResponseEntity<Post>(postActualizado, HttpStatus.OK);
		return respuesta;
	}	
	
	@RequestMapping(value="/posts/eliminar/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Post> eliminar(@PathVariable Integer id) {
		
		System.out.print("parametro eliminar "+id);
		
		Post p = postService.eliminar(id);
		
		ResponseEntity<Post> respuesta = new ResponseEntity<Post>(p,HttpStatus.OK);
		
		return respuesta;
	}
	
	@RequestMapping(value="/posts/buscar/{id}", method=RequestMethod.GET)
	public ResponseEntity<Post> findId(@PathVariable("id") Integer id) {
		
		System.out.print("parametro "+id);
		
		//Post postInsertado = postService.modificar(post);
		
		Post postEncontrado= postService.find(id);
		
		ResponseEntity<Post> respuesta = new ResponseEntity<Post>(postEncontrado,HttpStatus.OK);
		
		return respuesta;
	}
	
	
	
	@RequestMapping(value="/posts", method=RequestMethod.GET)
	public ResponseEntity<List<Post>> listar() {
		System.out.print("Hola em posts");
		List<Post> posts = postService.listar();
		ResponseEntity<List<Post>> respuesta = new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
		return respuesta;
	}
			
	
}

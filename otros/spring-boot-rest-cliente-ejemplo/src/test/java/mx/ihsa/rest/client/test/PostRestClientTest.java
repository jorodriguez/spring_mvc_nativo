package mx.ihsa.rest.client.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import mx.ihsa.rest.client.PostRestClient;
import mx.ihsa.rest.client.model.Post;

class PostRestClientTest {
	
	
	private PostRestClient cliente = new PostRestClient();

	@Test
	void testInsertar() {
		
		Post post = new Post();
		post.setTitulo("Titulo 3");
		post.setContenido("Contenido 3");
		
		Post retorno = cliente.insertar(post);
		
		assertTrue(retorno.getId() > 0);
						
		//fail("Not yet implemented");
	}

	@Test
	void testGetPosts() {
		
		List<Post> lista = cliente.getPosts();
		
		lista.forEach(e->{
			System.out.println("ID "+e.getId());
			System.out.println("TITULO "+e.getTitulo());
			System.out.println("CONTENIDO "+e.getContenido());
			System.out.println(" _______________________________ ");
			});
		
		//fail("Not yet implemented");
	}
	
	
	@Test
	void testModificar() {
		Post post = new Post();
		post.setId(3);
		post.setTitulo("Titulo Modificado ");
		post.setContenido("Contenido ModificadoModificadoModificadoModificado");
		
		
	   Post modificado =cliente.actualizar(post);
		
	    System.out.println("ID "+modificado.getId());
		System.out.println("TITULO "+modificado.getTitulo());
		System.out.println("CONTENIDO "+modificado.getContenido());
		System.out.println(" _______________________________ ");
	}
	
	@Test
	void testEliminar() {
		Post postEliminado = cliente.eliminar(4);
		
		System.out.println("Eliminado");
		System.out.println("ID "+postEliminado.getId());
		System.out.println("TITULO "+postEliminado.getTitulo());
		System.out.println("CONTENIDO "+postEliminado.getContenido());
		System.out.println(" _______________________________ ");
		
	}

}

package mx.ihsa.springbootrestejemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ihsa.springbootrestejemplo.model.Post;
import mx.ihsa.springbootrestejemplo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post guardar(Post post) {
		return postRepository.save(post);
	}

	public Post find(int id){
		
		Optional<Post> op = postRepository.findById(id);  
		
		return op.isPresent() ? op.get():null;
	}
	
	public Post eliminar(int id){
		
		Optional<Post> op = postRepository.findById(id);
		
	 	if(op.isPresent()) {
	 		
	 		postRepository.delete(op.get());
	 		
	 	}		
		
	 	return op.isPresent() ? op.get():null;
	}
	
	
	public Post modificar(Post post) {
		return postRepository.save(post);
	}
	
	
	public List<Post> listar() {
		return postRepository.findAll();
	}
	
}


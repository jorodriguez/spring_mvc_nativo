package mx.ihsa.springbootrestejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.ihsa.springbootrestejemplo.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}

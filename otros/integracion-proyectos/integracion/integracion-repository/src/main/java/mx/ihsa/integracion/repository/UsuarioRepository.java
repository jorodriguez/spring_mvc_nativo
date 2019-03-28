package mx.ihsa.integracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ihsa.integracion.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByEmail(String email); 
}

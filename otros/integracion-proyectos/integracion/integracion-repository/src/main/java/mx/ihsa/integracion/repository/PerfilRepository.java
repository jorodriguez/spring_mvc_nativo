package mx.ihsa.integracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ihsa.integracion.model.Perfil;


@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer>{

	public Perfil findByDescPerfil(String descPerfil);
}

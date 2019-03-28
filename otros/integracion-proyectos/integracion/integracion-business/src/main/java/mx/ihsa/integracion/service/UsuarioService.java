package mx.ihsa.integracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.ihsa.integracion.model.Usuario;
import mx.ihsa.integracion.repository.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario validarEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
}

package mx.ihsa.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ihsa.springmvc.dao.LoginDao;
import mx.ihsa.springmvc.dao.UsuarioDao;
import mx.ihsa.springmvc.model.Login;
import mx.ihsa.springmvc.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	public boolean insertar(Usuario usuario) {
		
		return usuarioDao.insertarUsuario(usuario);	
				
	}
	
	
}

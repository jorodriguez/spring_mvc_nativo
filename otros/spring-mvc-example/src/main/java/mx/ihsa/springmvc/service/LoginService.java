package mx.ihsa.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ihsa.springmvc.dao.LoginDao;
import mx.ihsa.springmvc.model.Login;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public Login validarUsuario(Login login) {
		
		return loginDao.validarUsuario(login);
		
	}
	
	
}

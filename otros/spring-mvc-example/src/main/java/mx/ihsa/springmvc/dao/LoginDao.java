package mx.ihsa.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.ihsa.springmvc.mapper.LoginMapper;
import mx.ihsa.springmvc.model.Login;

@Repository
public class LoginDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Login validarUsuario(Login login) {
		
		String sql = "SELECT * FROM login WHERE usuario = '"+login.getUsuario()+"' AND password = '"+login.getContrasena()+"'";
		
       List<Login> logins = jdbcTemplate.query(sql, new LoginMapper());
            
       
		return logins.size() > 0 ? logins.get(0) : null;
		
	}
	
	
}

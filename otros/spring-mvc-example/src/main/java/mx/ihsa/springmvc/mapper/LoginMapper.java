package mx.ihsa.springmvc.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.ihsa.springmvc.model.Login;
import mx.ihsa.springmvc.model.Usuario;


public class LoginMapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.setUsuario(rs.getString("usuario"));
		login.setContrasena(rs.getString("password"));		
		return login;
		
	}

	

}

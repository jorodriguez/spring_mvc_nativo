package mx.ihsa.springmvc.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.ihsa.springmvc.model.Login;
import mx.ihsa.springmvc.model.Usuario;


public class UsuarioMapper implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub		
		Usuario u = new Usuario();
		u.setUsuario(rs.getString("usuario"));
		u.setNombre(rs.getString("nombre"));
		u.setPassword(rs.getString("password"));		
		u.setAmaterno(rs.getString("amaterno"));
		u.setApaterno(rs.getString("apaterno"));			
		return u;
	}

	

}

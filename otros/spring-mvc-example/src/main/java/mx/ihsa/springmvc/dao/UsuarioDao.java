package mx.ihsa.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.ihsa.springmvc.mapper.LoginMapper;
import mx.ihsa.springmvc.model.Login;
import mx.ihsa.springmvc.model.Usuario;

@Repository
public class UsuarioDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean insertarUsuario(Usuario usuario) {
		
		String sqlInsert = "INSERT INTO login(usuario,password,nombre,apaterno,amaterno)"
						+ "	VALUES('"+usuario.getUsuario()+"','"+usuario.getPassword()+"','"+usuario.getNombre()+"','"+usuario.getApaterno()+"','"+usuario.getAmaterno()+"')";
		
		jdbcTemplate.execute(sqlInsert);
		
       return true;		
		
	}
	
	
}

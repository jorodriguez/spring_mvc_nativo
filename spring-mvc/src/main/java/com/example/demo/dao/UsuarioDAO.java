package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.model.Usuario;

@Repository
public class UsuarioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertUsuaro(Usuario usuaro) {

		return jdbcTemplate.update(
				"insert into usuario (nombre,edad) values ('" + usuaro.getNombre() + "', " + usuaro.getEdad() + ")");

	}

	public List<Usuario> getAll() {
		String sql = "Select * from usuario ";
		List<Usuario> usuarios = jdbcTemplate.query(sql, new LoginMapper());
		return usuarios;
	}
	
	public Usuario validaUsuario(Usuario login) {		
		String sql="Select * from login where usuario='"+login.getNombre()+"' ";
		List<Usuario> logins= jdbcTemplate.query(sql, new LoginMapper());
		return logins.size()>0 ? logins.get(0):null;		
	}


}

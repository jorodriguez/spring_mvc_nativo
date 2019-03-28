package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	
	public int registrarUsuario(Usuario usuaro) {
		return usuarioDAO.insertUsuaro(usuaro);
	}
	
	
	public List<Usuario> getAll(){
		return usuarioDAO.getAll();
	}
	
	public Usuario login(Usuario u) {
		return usuarioDAO.validaUsuario(u);
	}

}
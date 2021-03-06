package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;


@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	//@RequestMapping (value="/registro", method=RequestMethod.GET)	
	@RequestMapping (value="/bienvenida", method=RequestMethod.GET)
	public ModelAndView index() {		
		//ModelAndView mav= new ModelAndView("registro");		
		ModelAndView mav= new ModelAndView("bienvenida");
		List<Usuario> lista = usuarioService.getAll();		
		mav.addObject("usuario",new Usuario());
		mav.addObject("listaUsuarios",lista);
		return mav;
	}
	
	@RequestMapping (value="/procesarUsuario", method=RequestMethod.POST)	
	public ModelAndView registrarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		int registro= usuarioService.registrarUsuario(usuario);
		//ModelAndView mav= new ModelAndView("registro");
		ModelAndView mav= new ModelAndView("bienvenida");
		return mav;
	}
	

}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService loginService;
	
	@RequestMapping (value="/", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav= new ModelAndView("login"); //prefix suffix
		mav.addObject("login",new Usuario());
		return mav;
	}
	

	@RequestMapping (value="/procesarLogin", method=RequestMethod.POST)
	public ModelAndView login (@ModelAttribute("login") Usuario login) {
		
		if(loginService.login(login)!=null) {
			ModelAndView mav= new ModelAndView("bienvenida"); //prefix suffix
			return mav;
		}else {
			ModelAndView mav= new ModelAndView("login"); //prefix suffix
			return mav;
		}
	
	
	
}
	
}

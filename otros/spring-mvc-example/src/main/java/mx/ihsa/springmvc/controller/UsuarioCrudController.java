package mx.ihsa.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mx.ihsa.springmvc.model.Login;
import mx.ihsa.springmvc.model.Usuario;
import mx.ihsa.springmvc.service.LoginService;
import mx.ihsa.springmvc.service.UsuarioService;

@Controller
public class UsuarioCrudController {
	
	@Autowired
	private UsuarioService usuarioService;	
		
	
	@RequestMapping(value="/usuario_crud",method=RequestMethod.GET)
	public ModelAndView index() {
		
		//ModelAndView contiene los datos y las vistas que se invocara
		
		ModelAndView mv = new ModelAndView("usuario_crud");//suffix prefixx

		mv.addObject("usuarioInsertar", new Usuario());
		
		return mv;
		
	} 	
		
	
	@RequestMapping(value="/insertLogin",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("usuarioInsertar") Usuario usuarioInsertar) {		
		ModelAndView mv = new ModelAndView("usuario_crud");
		
		this.usuarioService.insertar(usuarioInsertar);
		
		return mv;
	}
	
	
}

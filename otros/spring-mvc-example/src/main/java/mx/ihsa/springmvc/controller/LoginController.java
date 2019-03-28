package mx.ihsa.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mx.ihsa.springmvc.model.Login;
import mx.ihsa.springmvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index() {
		
		//ModelAndView contiene los datos y las vistas que se invocara
		
		ModelAndView mv = new ModelAndView("login");//suffix prefixx

		mv.addObject("login", new Login());
		
		return mv;
		
	} 	
	
	@RequestMapping(value="procesarLogin",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("login") Login login) {
		
		ModelAndView mv = new ModelAndView();
		
		if(loginService.validarUsuario(login)!=null) {
			mv.setViewName("bienvenido");			
		}else{
			mv.setViewName("login");
		}
		
		
		/*ModelAndView mv = new ModelAndView();		
		
			if(login.getUsuario().equals(login.getContrasena())) {
				mv.setViewName("bienvenido");
			}else{
				mv.setViewName("login");
			}
			*/
		
			return mv;
	}
	
	
}

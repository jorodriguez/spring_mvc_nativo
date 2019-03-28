package mx.ihsa.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ihsa.mybatis.mapper.UsuarioMapper;
import mx.ihsa.mybatis.model.UsuarioExample.Criteria;
import mx.ihsa.mybatis.model.Usuario;
import mx.ihsa.mybatis.model.UsuarioExample;

@Component
@RestController
public class UsuariosRestController {
	
	//Equivalente al reporotprio	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	
	@RequestMapping(value="/usuarios/{email}",method=RequestMethod.GET)
	public boolean validarEmail(@PathVariable String email) {
		UsuarioExample example = new UsuarioExample();
		
		Criteria criterio = example.createCriteria();
		
		criterio.andEmailEqualTo(email);
		
		List<Usuario> usuarios= usuarioMapper.selectByExample(example);
		
		return !usuarios.isEmpty(); 
				
	}			
	
	
	@RequestMapping(value="/usuarios",method=RequestMethod.GET)
	public List<Usuario> listar(){
		
		return usuarioMapper.selectByExample(null); 
		
	}
	
	@RequestMapping(value="/usuarios",method=RequestMethod.POST)
	public boolean insertar(@RequestBody Usuario usuario){
		
		int cuantos = usuarioMapper.insert(usuario);
		
		return cuantos == 1;
		
	}
	
	@RequestMapping(value="/usuarios",method=RequestMethod.PUT)
	public boolean modificar(@RequestBody Usuario usuario){
		
		int cuantos = usuarioMapper.updateByExample(usuario, null);
		
		return cuantos > 0 ;
		
	}
	
	@RequestMapping(value="/usuarios",method=RequestMethod.DELETE)
	public boolean modificar(@PathVariable Integer idUsuario){
			
		int cuantos = usuarioMapper.deleteByPrimaryKey(idUsuario);		 
		
		//int cuantos = usuarioMapper.updateByExample(usuario, null);
		
		return cuantos > 0;
		
	}
	

}

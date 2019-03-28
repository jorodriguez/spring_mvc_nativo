package mx.ihsa.soap.service;

import java.util.List;

import javax.jws.WebMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ihsa.soap.model.Perfil;
import mx.ihsa.soap.repository.PerfilRepository;

@Service
public class PerfilService {
	
		@Autowired
		private PerfilRepository perfilRepository;
		
		@WebMethod
		public void insertar(Perfil perfil) {
			perfilRepository.save(perfil);
			
		}
		
		@WebMethod
		public List<Perfil> listar(){
			return perfilRepository.findAll();
			
		}		
	

}

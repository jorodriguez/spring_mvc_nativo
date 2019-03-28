package mx.ihsa.integracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

@SpringBootApplication
@ImportResource(locations="jaxwsconfig.xml")
public class IntegracionSoapJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracionSoapJpaApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean serveRegistrationBean() {		
		return new ServletRegistrationBean(new WSSpringServlet(),"/ws/*");
	}


}

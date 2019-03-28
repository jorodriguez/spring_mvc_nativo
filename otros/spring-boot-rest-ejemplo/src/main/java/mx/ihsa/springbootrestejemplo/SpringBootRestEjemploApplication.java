package mx.ihsa.springbootrestejemplo;

import javax.persistence.MappedSuperclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="mx.ihsa")
public class SpringBootRestEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestEjemploApplication.class, args);
	}

}

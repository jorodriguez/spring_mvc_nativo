package mx.ihsa.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="mx.ihsa.mybatis.mapper")
public class SpringBootRestMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestMybatisApplication.class, args);
	}

}

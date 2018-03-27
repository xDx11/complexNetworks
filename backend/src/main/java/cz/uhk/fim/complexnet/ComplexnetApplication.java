package cz.uhk.fim.complexnet;

import cz.uhk.fim.complexnet.service.TestEntityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComplexnetApplication {


	public static void main(String[] args) {
		SpringApplication.run(ComplexnetApplication.class, args);
	}

}

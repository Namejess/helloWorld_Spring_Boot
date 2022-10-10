package com.openclassroms.helloWorld.helloWorld;

import com.openclassroms.helloWorld.model.HelloWorld;
import com.openclassroms.helloWorld.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.openclassroms.helloWorld.service", "com.openclassroms.helloWorld" })
public class HelloWorldApplication implements CommandLineRunner {

	@Autowired
	public BusinessService bs;

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}

	public static void main(String[] args) {
				SpringApplication.run(HelloWorldApplication.class, args);
	}


}

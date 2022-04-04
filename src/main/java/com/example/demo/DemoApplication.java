package com.example.demo;

import com.example.demo.uitl.MyDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public MyDetails getMyDetails(){
		return new MyDetails("Bunu","24","BPUT");
	}

}

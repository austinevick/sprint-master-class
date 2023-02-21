package com.example.springmasterclass;
import com.example.springmasterclass.jsonplaceholder.JSONPlaceHolderConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringMasterClassApplication {


	public static void main(String[] args) {

		SpringApplication.run(SpringMasterClassApplication.class, args);

	}

}




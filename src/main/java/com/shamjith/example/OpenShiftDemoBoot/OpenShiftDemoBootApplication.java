package com.shamjith.example.OpenShiftDemoBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OpenShiftDemoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShiftDemoBootApplication.class, args);
	}

}

@RestController
class HomeController{
	
	@GetMapping("/")
	public String test() {
		return "test";
	}
}
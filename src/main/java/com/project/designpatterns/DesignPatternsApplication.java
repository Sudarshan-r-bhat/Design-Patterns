package com.project.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		var str = "heelo world"; // java 10 feature.
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}

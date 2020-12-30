package com.devsight.templatemultimodule.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.devsight.templatemultimodule"})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}

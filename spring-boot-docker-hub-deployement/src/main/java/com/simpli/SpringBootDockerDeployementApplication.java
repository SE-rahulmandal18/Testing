package com.simpli;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringBootDockerDeployementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerDeployementApplication.class, args);
	}

}


@Controller
class IndexController{
	
	static String randomWebAppID= new String(new Random().toString());
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "[WEBAPPID "+ randomWebAppID + "] Hello World from Spring";
	}
}

//mvn clean -Dmaven.test.skip=true pamaven.test.skip=true package
//java -jar target\spring-bootdemo-0.0.1-SNAPSHOT.jar

//docker build -t my-morning-spring-app --output type=docker .

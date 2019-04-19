package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//the main within this class is the starting location
@SpringBootApplication     //we tell springboot to start here by this annotation
// utlitty springboot allows us to use to startup here


public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args); 
		// your calling the static method run and passing the class and args

	}

}

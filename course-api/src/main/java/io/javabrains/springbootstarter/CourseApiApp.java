package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		/* Class and command line args.*/
		
		
		/* this command...
		 * 
		 * sets up default configuration
		 * Starts spring application context (spring is container for different services)
		 * Performs class path scan: scans annotated class paths (code)
		 * Starts tomcat server */
		SpringApplication.run(CourseApiApp.class, args);
	}

}
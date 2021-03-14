package com.example.booknest;
//LIENS UTILES OU EN COURT DE CHECK

/* Thymeleaf API : https://www.thymeleaf.org/apidocs/thymeleaf/3.0.12.RELEASE/
 * 
 * JAVA GUIDES : Spring Boot CRUD Web Application with Thymeleaf, Spring MVC, Spring Data JPA, Hibernate, MyS
 *https://www.youtube.com/watch?v=_5sAmaRJd2c
 *FINIE
 *
 *Code Java : Spring Boot Full Text Search with MySQL Database Example
 *https://www.youtube.com/watch?v=WPMQdnwPJLc
 *
 *Blogpost : https://uniquethrowdown.blogspot.com/2020/12/spring-boot-crud-operation-with.html
 *
 *Diff entre GET et POST requests : https://www.diffen.com/difference/GET-vs-POST-HTTP-Requests
 */

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooknestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooknestApplication.class, args);
	}
	
	/*Create a Logger to output the data in the DB
	 * log capture = obtenir l'activité de l'application, savoir comment elle tourne = troubleshooting
	 */
	private static final Logger log = LoggerFactory.getLogger(BooknestApplication.class);
	
}

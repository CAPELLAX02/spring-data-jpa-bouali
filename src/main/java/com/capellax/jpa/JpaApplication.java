package com.capellax.jpa;

import com.capellax.jpa.models.Author;
import com.capellax.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthorRepository authorRepository
//	) {
//		return args -> {
//			var author = Author.builder()
//					.firstName("John")
//					.lastName("Doe")
//					.age(25)
//					.email("john@email.com")
//					.build();
//
//			authorRepository.save(author);
//		};
//	}

}

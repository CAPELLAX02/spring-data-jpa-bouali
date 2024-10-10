package com.capellax.jpa;

import com.capellax.jpa.models.Author;
import com.capellax.jpa.models.Video;
import com.capellax.jpa.repositories.AuthorRepository;
import com.capellax.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	) {
		return args -> {
			/*
			var author = Author.builder()
					.firstName("John")
					.lastName("Doe")
					.age(25)
					.email("john@email.com")
					.build();

			authorRepository.save(author);
			*/

			var video = Video.builder()
					.name("abc")
					.length(5)
					.build();

			videoRepository.save(video);
		};
	}

}

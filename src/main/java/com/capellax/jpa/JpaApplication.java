package com.capellax.jpa;

import com.capellax.jpa.models.Author;
import com.capellax.jpa.models.Video;
import com.capellax.jpa.repositories.AuthorRepository;
import com.capellax.jpa.repositories.VideoRepository;
import com.github.javafaker.Faker;
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
			for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();

				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(18, 70))
						.email(faker.internet().emailAddress())
						.build();

				authorRepository.save(author);
			}

			/*var video = Video.builder()
					.name("abc")
					.length(5)
					.build();

			videoRepository.save(video);
			 */
		};
	}

}

package com.capellax.jpa.repositories;

import com.capellax.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository
        extends JpaRepository<Author, Integer> {



}

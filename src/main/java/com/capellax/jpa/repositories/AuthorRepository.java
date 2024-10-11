package com.capellax.jpa.repositories;

import com.capellax.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository
        extends JpaRepository<Author, Integer> {

    // select * from author where first_name = 'Ali'
    List<Author> findAllByFirstName(String firstName);

    // select * from author where first_name = 'ali'
    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    // select * from author where first_name is like '%al%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    // select * from author where first_name is like 'al%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String lastName);

    // select * from author where first_name is like '%al'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String lastName);

    // select * from author where first_name in ('ali', 'bou', 'coding')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> lastNames);

}

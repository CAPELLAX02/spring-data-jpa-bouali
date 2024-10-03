package com.capellax.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// Quick note: default 'Integer' value is 'null',
// whereas default 'int' value is '0'.
// 'int' is a primitive type, 'Integer' is a wrapper.

@Data
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )
    @TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id",
            valueColumnName = "id_value",
            allocationSize = 1
    )
    /*
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    */
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;

}

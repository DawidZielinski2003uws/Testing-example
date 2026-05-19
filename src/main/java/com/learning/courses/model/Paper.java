package com.learning.courses.model;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "paper")
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person tutor;

    private String title;

    private String type;

    private String additionalAuthors;

    private String isbn;

    private String topic;

}

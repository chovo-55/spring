package com.example.spring.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Project {
    @Id
    @SequenceGenerator(
            name = "project_sequence",
            sequenceName = "project_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "project_sequence"
    )
    @Column(name = "id")
    protected Long id;

    @Column(name = "type")
    protected String type;

    @Column(name = "name")
    protected String name;

    @Column(name = "price")
    protected Double price;

    @Column(name = "date")
    protected LocalDate date;

    public Project(String type, String name, Double price, LocalDate date) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.date = date;
    }
}

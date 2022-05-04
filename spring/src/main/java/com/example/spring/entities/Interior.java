package com.example.spring.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@ToString
public class Interior extends Project {
    protected String description;

    public Interior(String name, Double price, LocalDate date, String description) {
        super(name, price, date);
        this.description = description;
    }

    public Interior() {

    }

}

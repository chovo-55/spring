package com.example.spring.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity(name = "Interior")
@Table(name = "Interior")
public class Interior extends Project {

    @Column(name = "description")
    protected String description;

    public Interior(String type,String name, Double price, LocalDate date, String description) {
        super(type,name, price, date);
        this.description = description;
    }
}

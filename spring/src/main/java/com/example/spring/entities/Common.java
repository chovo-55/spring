package com.example.spring.entities;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Common extends Project {
    protected Double area;

    public Common(String name, Double price, LocalDate date, Double area) {
        super(name, price, date);
        this.area = area;
    }

}

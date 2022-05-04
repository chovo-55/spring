package com.example.spring.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Custom extends Project {
    protected double area;
    protected String garage;
    protected String heatingType;
    protected String heatingSource;

    public Custom(String name, Double price, LocalDate date, Double area, String garage, String heatingType, String heatingSource) {
        super(name, price, date);
        this.area = area;
        this.garage = garage;
        this.heatingType = heatingType;
        this.heatingSource = heatingSource;
    }
}
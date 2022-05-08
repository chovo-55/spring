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
@Entity(name = "Custom")
@Table(name = "Custom")
public class Custom extends Project {

    @Column(name = "area")
    protected double area;

    @Column(name = "heating_Type")
    protected String heatingType;

    @Column(name = "heating_source")
    protected String heatingSource;

    public Custom(String type, String name, Double price, LocalDate date, Double area, String heatingType, String heatingSource) {
        super(type,name, price, date);
        this.area = area;
        this.heatingType = heatingType;
        this.heatingSource = heatingSource;
    }
}
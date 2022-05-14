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
@Entity(name = "Common")
@Table(name = "Common")
public class Common extends Project {

    @Column(name = "area")
    protected Double area;

    public Common(String type, String name, Double price, LocalDate date, Double area) {
        super(type, name, price, date);
        this.area = area;
    }
}

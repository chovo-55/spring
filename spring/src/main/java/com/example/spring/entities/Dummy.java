package com.example.spring.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class Dummy {
    protected String type;
    protected String name;
    protected Double price;
    protected LocalDate date;
    protected Double area;
    protected String heatingType;
    protected String heatingSource;
    protected String description;

}

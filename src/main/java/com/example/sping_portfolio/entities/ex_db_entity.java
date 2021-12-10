package com.example.sping_portfolio.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//POJO
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ex_db_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String testString;
    private int testInt;
}

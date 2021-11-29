package com.example.sping_portfolio.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ex_db_entity {

    @Id
    private int id;

    private String testString;
    private int testInt;
}

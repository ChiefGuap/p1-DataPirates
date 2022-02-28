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
public class tv_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String genre;
    private String length;
    private int rank;

    public tv_entity(String name, String genre, String length, int rank) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.rank = rank;
    }
}

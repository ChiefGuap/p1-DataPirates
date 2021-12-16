package com.example.sping_portfolio.individual.sam.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String song;
    private String artist;
}

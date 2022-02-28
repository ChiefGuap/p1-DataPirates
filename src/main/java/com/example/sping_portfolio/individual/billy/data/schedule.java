package com.example.sping_portfolio.individual.billy.data;

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
public class schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int period;
    private String name;
    private String room;
}

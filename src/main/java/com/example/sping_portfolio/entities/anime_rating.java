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
public class anime_rating {

    //auto generate id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // defining variables
    private int rank;
    private String name;
    private int rating;
    private String review;

    // Created a constructor for easy backend use
    // This allows us to create a java object easily out of this entity
    public anime_rating(int rank, String name, int rating, String review) {
        id = id;
        this.rank = rank;
        this.name = name;
        this.rating = rating;
        this.review = review;
    }
}

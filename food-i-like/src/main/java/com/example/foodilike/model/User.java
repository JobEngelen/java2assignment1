package com.example.foodilike.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("firstname")
    private String firstname = null;

    @JsonProperty("lastname")
    private String lastname = null;

    @OneToOne
    private Address address;

    @JsonProperty("foodList")
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Food> foodList = new ArrayList<>();

}

package com.example.foodilike.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Address extends BaseEntity {

    @OneToOne
    private User user;
}

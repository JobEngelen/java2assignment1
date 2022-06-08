package com.example.foodilike.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Food extends BaseEntity{

    private String foodName;
    private int calories;

    public Food(String food, int calories) {
        this.foodName = food;
        this.calories = calories;
    }

    public Food() {

    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String food) {
        this.foodName = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + this.getId() +
                ", food='" + foodName + '\'' +
                ", calories=" + calories +
                '}';
    }
}

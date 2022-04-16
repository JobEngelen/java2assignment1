package com.example.foodilike.model;

public class Food {

    private long id;
    private String foodName;
    private int calories;

    public Food(long id, String food, int calories) {
        this.id = id;
        this.foodName = food;
        this.calories = calories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", food='" + foodName + '\'' +
                ", calories=" + calories +
                '}';
    }
}

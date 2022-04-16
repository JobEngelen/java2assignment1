package com.example.foodilike.service;

import com.example.foodilike.model.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    private List<Food> foods = new ArrayList<Food>();

    public FoodService() {
        foods.add(new Food(1, "Pannenkoek", 227100));
        foods.add(new Food(2, "Boerenkool", 500000));
        foods.add(new Food(3, "Komkommersalade", 115000));
        foods.add(new Food(4, "Een pruim", 45900));
        foods.add(new Food(5, "Appeltaart", 237100));
        foods.add(new Food(6, "Dadels", 281500));
    }

    public List<Food> getAllFoods() {
        return foods;
    }

    public Food addFood(Food food) {
        foods.add(food);
        return food;
    }

    public Food updateFood(Food food) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getId() == food.getId()) {
                foods.get(i).setFoodName(food.getFoodName());
                foods.get(i).setCalories(food.getCalories());
            }
        }
        return food;
    }

    public Food deleteFood(Food food) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getId() == food.getId()) {
                foods.remove(foods.get(i));
            }
        }
        return food;
    }
}

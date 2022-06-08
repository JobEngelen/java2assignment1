package com.example.foodilike.configuration;

import com.example.foodilike.model.Food;
import com.example.foodilike.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    private FoodService foodService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        foodService.addFood(new Food("Chocola", 545600));
    }
}

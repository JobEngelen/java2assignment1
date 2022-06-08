package com.example.foodilike.service;

import com.example.foodilike.model.Food;
import com.example.foodilike.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return (List<Food>) foodRepository.findAll();
    }

    public Food getById(long id) {
        return foodRepository.findById(id).get();
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    public Food updateFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteFood(long id) {
        foodRepository.deleteById(id);
    }
}

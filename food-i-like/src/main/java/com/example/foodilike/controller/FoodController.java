package com.example.foodilike.controller;

import com.example.foodilike.model.Food;
import com.example.foodilike.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAllFoods2() {
        return foodService.getAllFoods();
    }

    @PostMapping
    public Food addFood(@RequestBody Food food) {
        return foodService.addFood(food);
    }

    @PutMapping
    public Food updateFood(@RequestBody Food food) {
        return foodService.updateFood(food);
    }

    @DeleteMapping
    public Food deleteFood(@RequestBody Food food) {
        return foodService.deleteFood(food);
    }

    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public String name() {
        return "Pannenkoek";
    }

    @RequestMapping(value = "/foods2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllFoods() {
        List<Food> foods = foodService.getAllFoods();
        return ResponseEntity.status(200).body(foods);
    }



}

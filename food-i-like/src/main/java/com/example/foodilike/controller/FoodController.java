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

    @Autowired
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
    public void deleteFood(@RequestBody long id) {
        foodService.deleteFood(id);
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

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity update(@RequestBody Food food, @PathVariable long id) {
        Food existing = foodService.getById(id);

        existing.setFoodName(food.getFoodName());
        existing.setCalories(food.getCalories());

        Food result = foodService.updateFood(existing);

        return ResponseEntity.status(200).body(result);
    }


}

package com.example.foodilike.repository;

import com.example.foodilike.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {

    Food findByFoodName(String name);

}

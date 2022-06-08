package com.example.foodilike.repository;

import com.example.foodilike.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

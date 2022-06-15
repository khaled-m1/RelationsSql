package com.example.relationssql.service;

import com.example.relationssql.model.ManyToMany.Meal;
import com.example.relationssql.model.OneToOne.MyUser;
import com.example.relationssql.repository.MealRepository;
import com.example.relationssql.repository.MyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MealService {
    private final MealRepository mealRepository;

    public List<Meal> getMael() {
      return mealRepository.findAll();
    }

    public void addMael(Meal meal) {
        mealRepository.save(meal);
    }

}

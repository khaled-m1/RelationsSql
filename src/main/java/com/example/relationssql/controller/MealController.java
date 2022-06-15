package com.example.relationssql.controller;

import com.example.relationssql.model.ManyToMany.Meal;
import com.example.relationssql.model.OneToOne.MyUser;
import com.example.relationssql.service.MealService;
import com.example.relationssql.service.MyUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/meal")
@AllArgsConstructor
public class MealController {
    private final MealService mealService;

    @GetMapping
    public List<Meal> getMael(){
        return mealService.getMael();
    }

    @PostMapping
    public ResponseEntity addMael(@RequestBody Meal meal){
        mealService.addMael(meal);
        return ResponseEntity.status(201).body("accepted request :)");
    }
}

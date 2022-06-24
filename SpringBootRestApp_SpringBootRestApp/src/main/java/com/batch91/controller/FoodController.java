package com.batch91.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch91.model.Food;
@RestController
public class FoodController {
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/food")
	public Food getFood() {
		
	Food food = new Food(234,"poha",98);
	return food;
	}
	

	@RequestMapping("/foods")
	public List<Food> getAllFoods(){
		List<Food> foodList = new ArrayList<Food>();
		
		Food food1 = new Food(234,"poha",98);
		Food food2 = new Food(234,"idli",60);
		
		foodList.add(food1);
		foodList.add(food2);
		return foodList;
	}
}

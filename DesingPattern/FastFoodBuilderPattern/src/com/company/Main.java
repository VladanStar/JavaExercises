package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegan = mealBuilder.preparenonMeal();
        System.out.println("Normal Meal");
        nonVegan.showItems();
        System.out.println("Total cost = " + nonVegan.getCost());
    }
}

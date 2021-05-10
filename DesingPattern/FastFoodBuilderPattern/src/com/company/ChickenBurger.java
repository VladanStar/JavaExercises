package com.company;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    public  float price(){
        return (float) 50.5;
    }
}

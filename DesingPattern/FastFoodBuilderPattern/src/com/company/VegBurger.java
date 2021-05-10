package com.company;

public class VegBurger extends Burger {
    @Override
    public float price(){
        return (float) 25.0;
    }
    @Override
    public String name(){
        return "VegBurger";
    }
}

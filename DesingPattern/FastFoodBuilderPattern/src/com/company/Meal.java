package com.company;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem (Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = (float) 0.0;
        for(Item item :items){
            cost +=item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item :items){
            System.out.println("item: "+ item.name());
            System.out.println("Packing " + item.packing().pack());
            System.out.println("Price = " + item.price());
        }
    }
}

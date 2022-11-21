package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
public boolean check=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
        }
        else price=400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        price+=70;
    }

    public void addTakeaway(){
        // your code goes here
        if(!check)
        price+=20;
        check=true;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}

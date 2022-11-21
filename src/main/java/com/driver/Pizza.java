package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
public boolean checkToppings=false;
public boolean checkTakeaway=false;
public boolean checkExtraCheese=false;
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
        if(!checkExtraCheese)
        price+=80;
        checkExtraCheese=true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!checkToppings)
        price+=70;
        checkToppings=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!checkTakeaway)
        price+=20;
        checkTakeaway=true;
    }

    public String getBill(){
        // your code goes here
        bill=Integer.toString(price);
        return this.bill;
    }
}

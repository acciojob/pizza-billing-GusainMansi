package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
public boolean checkToppings=false;
public boolean checkTakeaway=false;
public boolean checkExtraCheese=false;
public boolean takenCheese=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }
        else this.price=400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!checkExtraCheese)
        this.price+=80;
        this.checkExtraCheese=true;
        this.takenCheese=true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!checkToppings){
            if(isVeg)
        {
            if(!takenCheese) {this.price+=80;}
                this.price+=70;

        }}


        else{
            if(!takenCheese) this.price+=80;
        this.price+=120; }
        this.checkToppings=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!checkTakeaway)
        this.price+=20;
        this.checkTakeaway=true;
    }

    public String getBill(){
        // your code goes here
        this.bill=Integer.toString(price);
        return this.bill;
    }
}

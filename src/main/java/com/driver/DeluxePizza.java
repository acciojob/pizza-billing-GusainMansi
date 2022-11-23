package com.driver;

public class DeluxePizza extends Pizza {
private int price;
private String bill;
    public boolean checkTakeaway=false;

boolean isVeg;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
          this.price= super.getPrice();
        if(isVeg){
            this.price+=150;
        }
        else this.price+=200;


    }

    @Override
    public int getPrice() {
        return this.price;
    }
    public void addExtraCheese(){
        // your code goes here


    }

    public void addExtraToppings(){
        // your code goes
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



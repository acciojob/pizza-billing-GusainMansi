package com.driver;

public class DeluxePizza extends Pizza {
private int price;
private String bill;
boolean isVeg;
    public boolean checkToppings=false;
    public boolean checkTakeaway=false;
    public boolean checkExtraCheese=false;

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

        if(!checkExtraCheese)
            this.price+=80;
        this.checkExtraCheese=true;

    }

    public void addExtraToppings(){
        // your code goes here

        if(!checkToppings){ if(isVeg)
            this.price+=70;

        else
            this.price+=120;}
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



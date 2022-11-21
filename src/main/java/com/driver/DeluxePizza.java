package com.driver;

public class DeluxePizza extends Pizza {
private int price;
private String bill;
boolean isVeg;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
          this.price= super.getPrice();
        if(isVeg){
            this.price+=80+70;
        }
        else this.price+=80+120;


    }

    @Override
    public int getPrice() {

        return this.price;
    }

    @Override
    public void addExtraCheese() {

    }



    @Override
    public void addExtraToppings() {
    }

    @Override
    public String getBill() {

        this.bill=Integer.toString(price);
        return this.bill;
    }

}



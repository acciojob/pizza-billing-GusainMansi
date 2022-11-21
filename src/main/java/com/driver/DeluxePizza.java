package com.driver;

public class DeluxePizza extends Pizza {
private int price;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg){
          this.price=(300+80+70);

        }
        else this.price=(300+80+120);



    }


}

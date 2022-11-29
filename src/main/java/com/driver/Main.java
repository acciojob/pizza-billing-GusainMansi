package com.driver;


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
boolean ans= Boolean.parseBoolean(sc.next());


    DeluxePizza dp = new DeluxePizza(ans);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(ans);
    p.addExtraCheese();
    p.addExtraToppings();
   p.addTakeaway();
    System.out.println(p.getBill());
  }
}
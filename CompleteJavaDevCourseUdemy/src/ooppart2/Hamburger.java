package ooppart2;

import java.util.ArrayList;

public class Hamburger {
  private String rollType;
  private String meat;
  protected double basePrice;
  protected double price;
  protected ArrayList<Addition> additions = new ArrayList<>();
  protected final int maxAdditions = 4;
          

  public Hamburger(String rollType, String meat, double price) {
    this.rollType = rollType;
    this.meat = meat;
    if (price < 1.20) {
      this.basePrice = 1.20;
      this.price = this.basePrice;
    } else {
      this.basePrice = price;
      this.price = this.basePrice;
    }    
    System.out.println("Hamburger's base price: " + this.basePrice + " dollars.");
  }

  public double getBasePrice() {
    return basePrice;
  }

  public double getPrice() {
    return price;
  }
  
  public void setAdditions(Addition addition) {
    if (addition.getHealthy()) {
      System.out.println("Healthy addition can not be added to this hamburger.");
      return;
    } else {    
      if (additions.size() < this.maxAdditions) {
        additions.add(addition);
        this.price += addition.getPrice();
        System.out.println(addition.getName() + " added for " + addition.getPrice() + " dollars."
                + "\nHamburger's current price: " + this.price + " dollars.");
      } else {
        System.out.println("Max number (" + maxAdditions + ") of additions added."
                + "\nHamburger's total price: " + this.getPrice() + " dollars.");
      }
    }
  }
  
  public void getAdditions() {
    System.out.println("The following additions added so far: ");
    for (Addition a : additions) {
      System.out.println("Name: " + a.getName() + 
              "\n Price: " + a.getPrice() + " dollars.");
    }
      System.out.println("Hamburger's current price: " + this.getPrice() + " dollars.");
  }
}

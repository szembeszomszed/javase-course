package ooppart2;

public class HealthyBurger extends Hamburger {
  protected final int maxAdditions = 6;

  public HealthyBurger(String meat, double price) {
    super("brown rye", meat, price);
  }

  @Override
  public void setAdditions(Addition addition) {   
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

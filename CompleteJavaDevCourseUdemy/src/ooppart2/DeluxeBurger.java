package ooppart2;

public class DeluxeBurger extends Hamburger {
  private Drink drink;
  private Chips chips;

  public DeluxeBurger(String rollType, String meat, double price, Drink drink, Chips chips) {
    super(rollType, meat, price);
    this.drink = drink;
    this.chips = chips;
    this.additions.add(this.drink);
    this.additions.add(this.chips);
  }

  @Override
  public void getAdditions() {
    System.out.println("The following additions added: ");
    for (Addition a : additions) {
      System.out.println("Name: " + a.getName() + 
              "\n Price: " + a.getPrice() + " dollars.");
      System.out.println("Hamburger's total price: " + this.getPrice() + " dollars.");
    }
  }

  @Override
  public void setAdditions(Addition addition) {
    System.out.println("No further addition possible.");
    return;
  }

}

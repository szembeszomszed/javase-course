
package ooppart2;

public class Main {
  public static void main(String[] args) {
    /*Position position = new Position(270, 340);
    Bed bed = new Bed(position);
    Room room = new Room(5, 4, bed, new Window(2));
    room.getTheBed().makeUpTheBed();
    room.enterTheRoom();
    room.leaveTheRoom();*/
    /*Printer printer = new Printer(50, true);
    printer.printPages(40);
    printer.printPages(90);
    printer.fillUpToner(70);
    printer.printPages(90);
    printer.fillUpToner(200);
    printer.printPages(90);*/
    
    // polimorphism
    /*Car car1 = new Car("generic car", 6);
    Car car2 = new Lada("Zsiguli", 12);
    Car car3 = new Polski("Polski Fiat", 4);
    Car car4 = new Trabant("Old Trabant", 4);
    car1.accelerateCar();
    car2.accelerateCar();
    car3.accelerateCar();
    car4.accelerateCar();*/
    
    // main challenge
    Cheese camembert = new Cheese("Camembert", 2.10);
    Bacon italianBacon = new Bacon("Italian bacon", 1.90);
    Tomato greenTomato = new Tomato("Green tomato", 1.90);
    HotPepper hungarianPepper = new HotPepper("Hungarian pepper", 0.90);
    Salat greekSalat = new Salat("Greek salat", 0);
    Sauce ketchup = new Sauce("Ketchup", 0.70);
    Drink coke = new Drink("Coke", 1.20);
    Chips belgianChips = new Chips("Belgian chips", 3.10);
    Hamburger hamburger1 = new Hamburger("normal", "pork", 3.40);
    HealthyBurger healthyBurger1 = new HealthyBurger("beef", 3.90);
    DeluxeBurger deluxeBurger1 = new DeluxeBurger("normal", "pork", 5.10, coke, belgianChips);
    hamburger1.setAdditions(camembert);
    hamburger1.setAdditions(italianBacon);
    hamburger1.getAdditions();
    hamburger1.setAdditions(greekSalat);
    hamburger1.setAdditions(ketchup);
    hamburger1.getAdditions();
    hamburger1.setAdditions(hungarianPepper);
    hamburger1.getAdditions();
    hamburger1.setAdditions(camembert);
    healthyBurger1.setAdditions(camembert);
    healthyBurger1.setAdditions(italianBacon);
    healthyBurger1.setAdditions(greekSalat);
    healthyBurger1.setAdditions(ketchup);
    healthyBurger1.setAdditions(hungarianPepper);
    healthyBurger1.getAdditions();
    healthyBurger1.setAdditions(camembert);
    healthyBurger1.setAdditions(belgianChips);
    healthyBurger1.setAdditions(camembert);
    healthyBurger1.setAdditions(coke);
    healthyBurger1.getAdditions();
    deluxeBurger1.setAdditions(coke);
  }
}

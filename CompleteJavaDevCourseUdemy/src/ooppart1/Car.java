package ooppart1;

public class Car extends Vehicle {
  
  private int wheel;
  
  public Car(int width, int height, int weight, int wheel) {
    super(width, height, weight);
    this.wheel = wheel;
  }

  @Override
  public void move(int speed) {
    System.out.println("Car.move() called. Car is moving at " + speed);
    changeGears();
  }  
  
  private void changeGears() {
    System.out.println("Car.changeGears() called.");
  }
  
}

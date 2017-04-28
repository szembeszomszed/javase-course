package ooppart1;

public class Vehicle {
  private int width;
  private int height;
  private int weight;
  private int currentSpeed;

  public Vehicle(int width, int height, int weight) {
    this.width = width;
    this.height = height;
    this.weight = weight;
    this.currentSpeed = 0;
  }
  
  public void move(int speed) {
    System.out.println("Vehicle.move() called. Vehicle is moving at " + (currentSpeed += speed));
  }
  
  public void steer(String direction) {
    System.out.println("Vehicle.steer() called. Vehicle is steered to " + direction);
  }
}

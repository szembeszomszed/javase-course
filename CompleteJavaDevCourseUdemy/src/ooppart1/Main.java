
package ooppart1;
public class Main {
  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle(1000, 500, 1_000_000);
    vehicle1.move(50);
    Car car1 = new Car(2000, 4000, 2000, 4);
    car1.move(100);
    car1.steer("right");
    Tesla tesla1 = new Tesla(2100, 3900, 2100);
    tesla1.move(90);
  }
}

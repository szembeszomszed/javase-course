
package ooppart1;
public class Tesla extends Car {
  
  public Tesla(int width, int height, int weight) {
    super(width, height, weight, 4);
  }

  @Override
  public void move(int speed) {
    System.out.println("Tesla.move() called. Tesla is moving at " + speed);
    switchToElectric();
  }   
  
  private void switchToElectric() {
    System.out.println("Tesla.switchToElectric() called.");
  }
  
}

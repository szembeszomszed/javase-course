package ooppart2;


public class Bed {
  private Position position;

  public Bed(Position position) {
    this.position = position;
  }

  public Position getPosition() {
    return position;
  }  
  
  public void makeUpTheBed() {
    System.out.println("Bed is made up.");
  }
}

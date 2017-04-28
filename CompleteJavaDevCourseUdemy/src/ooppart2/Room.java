package ooppart2;

public class Room {
  private int width;
  private int height;
  private Bed theBed;
  private Window theWindow;

  public Room(int width, int height, Bed theBed, Window theWindow) {
    this.width = width;
    this.height = height;
    this.theBed = theBed;
    this.theWindow = theWindow;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public Bed getTheBed() {
    return theBed;
  }

  private Window getTheWindow() {
    return theWindow;
  }
  
  public void enterTheRoom() {
    if (!getTheWindow().isOpen()) {
      getTheWindow().openTheWindow();
      System.out.println("Window opened when entering the room.");
    } else {
      System.out.println("Window was already open.");
    }
  }
  
  public void leaveTheRoom() {
    if (getTheWindow().isOpen()) {
      getTheWindow().closeTheWindow();
      System.out.println("Window closed when leaving the room.");
    } else {
      System.out.println("Window was already closed.");
    }
  }
  
  
}

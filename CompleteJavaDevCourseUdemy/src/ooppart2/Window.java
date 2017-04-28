
package ooppart2;

public class Window {
  private int wing;
  private boolean isOpen;

  public Window(int wing) {
    this.wing = wing;
    this.isOpen = true;
  }

  public boolean isOpen() {
    return isOpen;
  }
  
  public void openTheWindow() {
    this.isOpen = true;
    System.out.println("Window opened.");
  }
  
  public void closeTheWindow() {
    this.isOpen = false;
    System.out.println("Window closed by calling closeTheWindow().");
  }
}

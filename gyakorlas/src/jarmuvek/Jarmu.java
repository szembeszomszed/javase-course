package jarmuvek;

interface Halad {
  void halad();
}

public class Jarmu implements Halad {
  
  public String kategoria;
  
  public Jarmu() {
  }

  @Override
  public void halad() {
    System.out.println("A jármű halad.");
  }  
  
}

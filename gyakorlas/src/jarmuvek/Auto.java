package jarmuvek;

public class Auto extends Jarmu {
  
  private int kerekDb;
  public Auto(String kategoria, int kerekDb) {
    this.kategoria = kategoria;
    this.kerekDb = kerekDb;
  }

  @Override
  public void halad() {
    System.out.println("Ez az autó egy " + kategoria + ", " + kerekDb + " keréken gurul."); 
  }
  
  
  
}

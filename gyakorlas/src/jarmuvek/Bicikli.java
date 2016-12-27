package jarmuvek;

public class Bicikli extends Jarmu {
  private int kerekDb;
  private int hajtoEmberDb;
  
  public Bicikli(String kategoria, int kerekDb) {
    this.kategoria = kategoria;
    this.kerekDb = kerekDb;
    hajtoEmberDb = 1;
  }
  
  public Bicikli(String kategoria, int kerekDb, int hajtoEmberDb) {
    this.kategoria = kategoria;
    this.kerekDb = kerekDb;
    this.hajtoEmberDb = hajtoEmberDb;
  }

  @Override
  public void halad() {
    System.out.println("Ez a bicikli egy " + kategoria + ", " + kerekDb + " keréken gurul és " + hajtoEmberDb + " ember hajtja."); 
  } 
    
}

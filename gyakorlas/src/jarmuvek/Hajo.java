
package jarmuvek;

public class Hajo extends Jarmu {
  private String hajtoEro;
  
  public Hajo(String kategoria, String hajtoEro) {
    this.kategoria = kategoria;
    this.hajtoEro = hajtoEro;
  }

  @Override
  public void halad() {
    System.out.println("Ez a hajó egy " + kategoria + ", " + hajtoEro + " hajtja."); 
  }  
  
}

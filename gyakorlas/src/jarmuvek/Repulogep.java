package jarmuvek;

public class Repulogep extends Jarmu {
  private String hajtoEro;
  
  public Repulogep(String kategoria, String hajtoEro) {
    this.kategoria = kategoria;
    this.hajtoEro = hajtoEro;
  }

  @Override
  public void halad() {
    System.out.println("Ez a repülőgép egy " + kategoria + ", " + hajtoEro + " hajtja."); 
  }  
  
}

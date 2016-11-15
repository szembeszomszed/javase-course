package tengerimalacegynapja;

class Emlosallat {
  private String faj;
  public String nev;
  private int labDb = 4;
  private double tomeg;

  public Emlosallat(String faj, String nev, double tomeg) {
    this.faj = faj;
    this.nev = nev;
    this.tomeg = tomeg;
  }
  
  public double getTomeg() {
    return tomeg;
  }
  
  public double taplalkozik() {
    int tomegnovekedes = (int) (Math.random() * 6);
    tomeg += tomeg * tomegnovekedes / 100;
    return tomeg;
  }
  
  public double urit() {
    int tomegcsokkenes = (int) (Math.random() * 6);
    tomeg -= tomeg * tomegcsokkenes / 100;
    return tomeg;
  }
  
  public double szaladgal() {
    int tomegcsokkenes = (int) (Math.random() * 11);
    tomeg -= tomeg * tomegcsokkenes / 100;
    return tomeg;
  }
  
  public void alszik() {};

  @Override
  public String toString() {
    return "{Faj: " + faj + ", név: " + nev + ", lábak száma: " + labDb + ", aktuális testtömeg: " + extra.Format.left(tomeg, 0, 2) + "kg.}";
  } 
  
}

public class Háromszög4 {

  private static
    Háromszög[] háromszögTömb = new Háromszög[50];      //1
  private static double területÖsszeg, területÁtlag;    //2

  private static void tömbFeltölt() {                   //3
    double oldal;
    for(int i=0; i<háromszögTömb.length; i++) {
      oldal=(int)(Math.random()*10+1);
      háromszögTömb[i]=new Háromszög(oldal);            //4
    }
  }

  private static void tömbLista() {                     //5
    for(int i=0; i<3; i++)
      System.out.println((i+1)+". háromszög: "+
        háromszögTömb[i]);
    System.out.println("...");
    System.out.println("50. háromszög: "+
      háromszögTömb[49]);
  }

  private static double háromszögTerületÖsszeg() {      //6
    double összeg=0;
    for(int i=0; i<háromszögTömb.length; i++)
      összeg+=háromszögTömb[i].terület();               //7
    return összeg;
  }

  public static void main(String[] args) {
    System.out.println("Műveletek háromszögekkel\n");
    tömbFeltölt();
    tömbLista();
    területÖsszeg=háromszögTerületÖsszeg();             //8
    területÁtlag=területÖsszeg/háromszögTömb.length;    //9
    System.out.println("\nA háromszögek területének "+
      "összege: "+területÖsszeg);
    System.out.println("\nA háromszögek területének "+
      "átlaga: "+területÁtlag);
  }
}

class Háromszög {

  private double a;

  public Háromszög(double a) {
    setA(a);
  }

  public void setA(double a) {
    if(a<=0)
      a=1;
    this.a=a;
  }

  public double getA() {
    return a;
  }

  public double kerület() {
    return 3*a;
  }

  public double terület() {
    return a*a*Math.sqrt(3)/4;
  }

  @Override
  public String toString() {
    return "Egyenlőoldalú háromszög\n" +
      "  oldalának hossza: "+a+
      "  kerülete: "+extra.Format.left(kerület(), 0, 2)+
      "  területe: "+extra.Format.left(terület(), 0, 2);
  }

  public boolean equals(Háromszög háromszög) {
    return háromszög.getA()==a;
  }
}
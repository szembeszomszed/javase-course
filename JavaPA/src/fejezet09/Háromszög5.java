package fejezet09_Háromszög5;

public class Háromszög5 {

  private static
    Háromszög[] háromszögTömb = new Háromszög[50];

  private static void tömbFeltölt() {
    double oldal;
    for(int i=0; i<háromszögTömb.length; i++) {
      oldal=Math.random()*99+1;
      háromszögTömb[i]=new Háromszög(oldal);
    }
  }

  private static void tömbLista() {
    for(int i=0; i<háromszögTömb.length; i++)
      System.out.println((i+1)+". háromszög: "+
        háromszögTömb[i]);
  }

  private static void háromszögKiválaszt() {
    double minKerület=háromszögTömb[0].kerület();
    double maxTerület=háromszögTömb[0].terület();
    int minIndex=0, maxIndex=0;
    double aktKerület, aktTerület;
    for(int i=1; i<háromszögTömb.length; i++) {
      aktKerület=háromszögTömb[i].kerület();
      if(aktKerület<minKerület) {
        minIndex=i;
        minKerület=aktKerület;
      }
      aktTerület=háromszögTömb[i].terület();
      if(aktTerület>maxTerület) {
        maxIndex=i;
        maxTerület=aktTerület;
      }
    }
    System.out.println("\nA legkisebb kerületű háromszög sorszáma: "+
      (minIndex+1)+", kerülete: "+háromszögTömb[minIndex].kerület()+
      "\nTöbb azonos legkisebb kerületű háromszög esetében ez az első.");
    System.out.println("\nA legnagyobb területű háromszög sorszáma: "+
      (maxIndex+1)+", területe: "+háromszögTömb[maxIndex].terület()+
      "\nTöbb azonos legnagyobb területű háromszög esetében ez az első.");
  }

  public static void main(String[] args) {
    System.out.println("Műveletek háromszögekkel\n");
    tömbFeltölt();
    tömbLista();
    háromszögKiválaszt();
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
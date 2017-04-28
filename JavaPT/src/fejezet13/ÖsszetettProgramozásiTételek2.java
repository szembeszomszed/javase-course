import java.util.Vector;

public class ÖsszetettProgramozásiTételek2 {

  static Vector<Integer> vektor=new Vector<Integer>();

  static void másolás() {
    Vector<Integer> vektor2=new Vector<Integer>();      //1
    for(int vektorelem: vektor)                         //2
      vektor2.add(2*vektorelem);                        //3
    System.out.println("A vektorelemek duplázva: "+
      vektor2);
  }

  static void kiválogatás() {
    Vector<Integer> vektor2=new Vector<Integer>();
    for(int vektorelem: vektor)
      if(vektorelem<50)                                 //4
        vektor2.add(vektorelem);
    System.out.println("Az 50-nél kisebb vektorelemek: "+
      vektor2);
  }

  static void szétválogatás() {
    Vector<Integer> párosVektor=new Vector<Integer>();
    Vector<Integer> páratlanVektor=new Vector<Integer>();
    for(int vektorelem: vektor)
      if(vektorelem%2==0)                               //5
        párosVektor.add(vektorelem);                    //6
      else
        páratlanVektor.add(vektorelem);                 //7
    System.out.println("A páros vektorelemek: "+
      párosVektor);
    System.out.println("A páratlan vektorelemek: "+
      páratlanVektor);
  }

  static void vektorFeltölt() {
    for(int i=1; i<=20; i++)
      vektor.add((int)(Math.random()*90+10));
  }

  static void vektorLista() {
    System.out.println("A vektor elemei: "+vektor);
  }

  public static void main(String[] args) {
    vektorFeltölt();
    vektorLista();
    másolás();
    kiválogatás();
    szétválogatás();
  }
}
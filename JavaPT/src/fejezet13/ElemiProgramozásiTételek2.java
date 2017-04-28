import java.util.Collections;
import java.util.Vector;

public class ElemiProgramozásiTételek2 {

  static Vector<Integer> vektor=new Vector<Integer>(20);//1

  static void vektorFeltölt() {
    for(int i=0; i<18; i++)
      vektor.add((int)(Math.random()*90+10));           //2
    vektor.add(80);                                     //3
    vektor.add((int)(Math.random()*45)*2+11);           //4
  }

  static void vektorLista() {
    System.out.println("A vektor elemei:\n"+vektor);
  }

  static void összegzés() {
    int összeg=0;
    for(int vektorelem: vektor)                         //5
      összeg+=vektorelem;
    System.out.println("A vektor elemeinek összege "+
      összeg+".");
  }

  static void eldöntés1() {
    System.out.println("Van-e 30 a vektorelemek között? "+
      (vektor.contains(30)?"Van.":"Nincs."));           //6
  }
  
  static void eldöntés2() {
    System.out.print("Van-e öttel osztható vektorelem? ");
    int i=0;
    while(i<=vektor.size()-1 && !(vektor.get(i)%5==0))  //7
      i++;
    boolean van=(i<=vektor.size()-1);
    System.out.println(van?"Van.":"Nincs.");
  }

  static void kiválasztás1() {
    System.out.println("A vektor első 80-as elemének "+
      "sorszáma: "+(vektor.indexOf(80)+1)+".");         //8
  }

  static void kiválasztás2() {
    int i=0;
    while(i<=vektor.size()-1 && !(vektor.get(i)%2==1))  //9
      i++;
    System.out.println("A vektor első páratlan eleme "+
      vektor.get(i)+", sorszáma: "+(i+1)+".");
  }

  static void lineárisKeresés1() {
    int i=vektor.indexOf(24);                          //10
    System.out.println("Van-e a vektorban 24? "+ (i!=-1?
      "Van, az első sorszáma: "+(i+1)+".":"Nincs."));
  }

  static void lineárisKeresés2() {
    int i=0;
    while(i<=vektor.size()-1 && !(vektor.get(i)>24))   //11
      i++;
    boolean van=(i<=vektor.size()-1);
    System.out.println("Van-e a vektorban 24-nél nagyobb "+
      "elem? "+
      (van?"Van, az első sorszáma: "+(i+1)+".":"Nincs."));
  }

  static void megszámolás() {
    int db=0;
    for(int vektorelem: vektor)                        //12
      if(vektorelem%2==0)
        db++;
    System.out.println("A vektor páros elemeinek száma "+
      db+".");
  }

  static void maximumKiválasztás1() {
    int maxHely=0, maxÉrték=vektor.get(maxHely);
    for(int i=1; i<=vektor.size()-1; i++) {            //13
      if(vektor.get(i)>maxÉrték) {
        maxÉrték=vektor.get(i);
        maxHely=i;
      }
    }
    System.out.println("A vektor elemei közül a "+
      "legnagyobb: "+maxÉrték+
      ", az első sorszáma: "+(maxHely+1)+".");
  }

  static void maximumKiválasztás2() {
    int maxÉrték=vektor.get(0);
    for(int vektorelem: vektor)                        //14
      if(vektorelem>maxÉrték)
        maxÉrték=vektorelem;
    System.out.println("A vektor elemei közül a "+
      "legnagyobb: "+maxÉrték+", az első sorszáma: "+
      (vektor.indexOf(maxÉrték)+1)+".");               //15
  }

  static void maximumKiválasztás3() {
    int maxÉrték=Collections.max(vektor);              //16
    System.out.println("A vektor elemei közül a "+
      "legnagyobb: "+maxÉrték+", az első sorszáma: "+
      (vektor.indexOf(maxÉrték)+1)+".");               //17
  }

  public static void main(String[] args) {
    vektorFeltölt();
    vektorLista();
    összegzés();
    eldöntés1();
    eldöntés2();
    kiválasztás1();
    kiválasztás2();
    lineárisKeresés1();
    lineárisKeresés2();
    megszámolás();
    maximumKiválasztás1();
    maximumKiválasztás2();
    maximumKiválasztás3();
  }
}
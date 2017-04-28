import java.util.Vector;

public class ArmstrongSzámok2 {

  static boolean armstrong(int szám) {
    int másolat=szám;
    int százas=másolat/100;
    másolat%=100;
    int tízes=másolat/10;
    másolat%=10;
    int egyes=másolat;
    return (100*százas+10*tízes+1*egyes==
       Math.pow(százas, 3)+Math.pow(tízes, 3)+Math.pow(egyes, 3));
  }

  public static void main(String[] args) {
    Vector<Integer> vektor=new Vector<Integer>();
    for(int i=100; i<=999; i++)
      if(armstrong(i))
        vektor.add(i);
    System.out.println("A háromjegyű Armstrong számok: "+vektor);
  }
}
import java.util.Vector;

public class ÁtlagtólValóEltérés3 {
  public static void main(String[] args) {
    Vector<Integer> vektor=new Vector<Integer>();    
    int összeg=0, szám;
    for(int i=1; i<100; i++) {
      szám=(int)(Math.random()*90+10);
      vektor.add(szám);
      összeg+=szám;
    }
    double átlag=(double)összeg/100;
    System.out.println("A tömbelemek átlaga: "+extra.Format.left(átlag, 0, 2));
    int db=0;
    for(int elem: vektor)
      if(átlag*0.8<=elem && elem<=átlag*1.2)
        db++;
    System.out.println(db+" olyan vektorelem van, amely az átlagtól legfeljebb 20 százalékkal tér el.");
  }
}
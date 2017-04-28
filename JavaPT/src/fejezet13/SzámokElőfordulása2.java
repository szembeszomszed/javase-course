import java.util.Vector;

public class SzámokElőfordulása2 {
  public static void main(String[] args) {
    System.out.println("500 db kétjegyű szám előfordulása");

    Vector<Integer> vektor=new Vector<Integer>();
    for(int i=1; i<=500; i++)
      vektor.add((int)(Math.random()*90+10));

    Vector<Integer> dbVektor=new Vector<Integer>(100); //gyűjtő
    //csak a 10 és 99 közötti indexeit használjuk,
    //így kényelmes az indexelés
    for(int i=1; i<=100; i++)
      dbVektor.add(0);

    int szám;
    for(int i=0; i<vektor.size(); i++) {
      szám=vektor.get(i);
      dbVektor.set(szám, dbVektor.get(szám)+1); //összegyűjtés
    }

    for(int i=10; i<=99; i++)
      System.out.println(extra.Format.right(i, 4)+": "+dbVektor.get(i)+" db");
  }
}
public class SzámokElőfordulása {
  public static void main(String[] args) {
    System.out.println("500 db kétjegyű szám előfordulása");

    int[] tömb=new int[500]; //tömb
    for(int i=0; i<500; i++)
      tömb[i]=(int)(Math.random()*90+10);

    int[] dbTömb=new int[100]; //gyűjtő
    //csak a 10 és 99 közötti indexeit használjuk,
    //így kényelmes az indexelés
    for(int i=10; i<=99; i++)
      dbTömb[i]=0;

    for(int i=0; i<500; i++)
      dbTömb[tömb[i]]++; //összegyűjtés

    for(int i=10; i<=99; i++)
      System.out.println(extra.Format.right(i, 4)+": "+dbTömb[i]+" db");
  }
}
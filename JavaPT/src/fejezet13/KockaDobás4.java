import java.util.Vector;

public class KockaDobás4 {
  public static void main(String[] args) {
    System.out.println("Kockadobás statisztikája (2 kockával egyszerre)");
    int dobásDb;
    while((dobásDb=extra.Console.readInt("Kockadobások száma: "))<=0)
      System.out.println("Nem pozitív. Újra!");
    Vector<Integer> dobásVektor=new Vector<Integer>();
    for(int i=0; i<=12; i++)
      dobásVektor.add(0);
    int dobás1, dobás2;
    for(int i=1; i<=dobásDb; i++) {
      dobás1=(int)(Math.random()*6+1);
      dobás2=(int)(Math.random()*6+1);
      dobásVektor.set(dobás1+dobás2, dobásVektor.get(dobás1+dobás2)+1);
    }
    System.out.println("\n"+dobásDb+" dobásból a dobott számok összege:");
    for(int i=2; i<=12; i++)
      System.out.println("  "+i+" volt: "+dobásVektor.get(i)+" db");
  }
}
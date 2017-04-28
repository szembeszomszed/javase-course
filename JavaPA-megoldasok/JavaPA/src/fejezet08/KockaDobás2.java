public class KockaDobás2 {
  public static void main(String[] args) {
    System.out.println("Kockadobás statisztikája (2 kockával egyszerre)");
    int dobásDb;
    while((dobásDb=extra.Console.readInt("Kockadobások száma: "))<=0)
      System.out.println("Nem pozitív. Újra!");
    int[] dobásTömb=new int[13];
    for(int i=2; i<=12; i++)
      dobásTömb[i]=0;
    int dobás1, dobás2;
    for(int i=1; i<=dobásDb; i++) {
      dobás1=(int)(Math.random()*6+1);
      dobás2=(int)(Math.random()*6+1);
      dobásTömb[dobás1+dobás2]++;
    }
    System.out.println("\n"+dobásDb+" dobásból a dobott számok összege:");
    for(int i=2; i<=12; i++)
      System.out.println("  "+i+" volt: "+dobásTömb[i]+" db");
  }
}
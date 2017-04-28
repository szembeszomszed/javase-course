public class KockaDobás1 {
  public static void main(String[] args) {
    System.out.println("Kockadobás statisztikája");
    int dobásDb;
    while((dobásDb=extra.Console.
        readInt("Kockadobások száma: "))<=0)            //1
      System.out.println("Nem pozitív. Újra!");
    int[] dobásTömb=new int[7];                         //2
    for(int i=1; i<=6; i++)                             //3
      dobásTömb[i]=0;                                   //4
    int dobás;
    for(int i=1; i<=dobásDb; i++) {                     //5
      dobás=(int)(Math.random()*6+1);                   //6
      dobásTömb[dobás]++;                               //7
    }
    System.out.println("\n"+dobásDb+" dobásból:");
    for(int i=1; i<=6; i++)                             //8
      System.out.println("  "+i+" volt: "+
        dobásTömb[i]+" db");                            //9
  }
}
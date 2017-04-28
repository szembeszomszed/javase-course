public class KockaDobás3 {
  public static void main(String[] args) {
    System.out.println("Kockadobás statisztikája " +
      "(2 kockával egyszerre)");
    int dobásDb;
    while((dobásDb=extra.Console.
        readInt("Kockadobások száma: "))<=0)
      System.out.println("Nem pozitív. Újra!");

    int[][] dobásTömb=new int[7][7];                    //1
    for(int i=1; i<=6; i++)
      for(int j=1; j<=6; j++)
        dobásTömb[i][j]=0;                              //2

    int dobás1, dobás2;
    for(int i=1; i<=dobásDb; i++) {                     //3
      dobás1=(int)(Math.random()*6+1);
      dobás2=(int)(Math.random()*6+1);
      dobásTömb[dobás1][dobás2]++;                      //4
    }

    System.out.print("\n"+dobásDb+" dobásból a " +
      "dobások számkombinációinak előfordulása:\n      ");
    for(int i=1; i<=6; i++)
      System.out.print("    "+i+" "); //fejléc
    System.out.println("\n    -------------------------"+
      "------------");
    for(int i=1; i<=6; i++) { //táblázat
      System.out.print("  "+i+" |");
      for(int j=1; j<=6; j++)
        System.out.print(extra.Format.
          right(dobásTömb[i][j], 6));                   //5
      System.out.println();
    }
  }
}
public class Totó1 {
  public static void main(String[] args) {
    System.out.println("Véletlenszerű totószelvény\n"+
      "  1  2  3  4  5  6  7  8  9 10 11 12 13 +1");    //1
    int tipp;
    for(int i=1; i<=14; i++) {
      tipp=(int)(Math.random()*3);       // 0 vagy 1 vagy 2
      if(tipp==0)
        System.out.print("  X");
      else
        System.out.print("  "+tipp);
    }
  }
}
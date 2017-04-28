public class Totó3 {
  public static void main(String[] args) {
    System.out.println("Véletlenszerű totószelvény");
    for(int i=1; i<14; i++)
      System.out.print(extra.Format.right(i, 3));
    System.out.println(" +1");
    int tipp;
    for(int i=1; i<=14; i++) {
      tipp=(int)(Math.random()*3);
      System.out.print(tipp==0?"  X":"  "+tipp);
    }
  }
}
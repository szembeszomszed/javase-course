public class Totó2 {
  public static void main(String[] args) {
    for(int i=1; i<14; i++)                             //1
      System.out.print(extra.Format.right(i, 3));
    System.out.println(" +1");
    double tipp;
    for(int i=1; i<=14; i++) {
      tipp=Math.random();
      System.out.print("  ");
      if(tipp<(double)1/3)                              //2
        System.out.print("1");
      else if(tipp<(2.0/3))                             //3
        System.out.print("2");
      else                                              //4
        System.out.print("X");
    }
  }
}
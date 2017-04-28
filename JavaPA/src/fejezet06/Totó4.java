public class Totó4 {
  public static void main(String[] args) {
    System.out.println("Véletlenszerű totószelvény");
    for(int i=1; i<14; i++)
      System.out.print(extra.Format.right(i, 3));
    System.out.println(" +1");
    double tipp;
    for(int i=1; i<=14; i++) {
      tipp=Math.random();
      System.out.print("  "+(tipp<(double)1/3?"1":tipp<2.0/3?"2":"X"));
    }
  }
}
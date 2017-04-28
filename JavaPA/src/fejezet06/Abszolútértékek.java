public class Abszolútértékek {
  public static void main(String[] args) {
    System.out.println("Számok abszolút értékei");
    for(int i=3; i>=-3; i--)
      System.out.print("|"+i+"|="+Math.abs(i)+", ");
  }
}
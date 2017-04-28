public class CsillagHáromszög {
  public static void main(String[] args) {
    for(int i=1; i<=20; i++) {
      for(double j=1; j<=i; j+=0.5)
        System.out.print("*");
      System.out.println();
    }
  }
}
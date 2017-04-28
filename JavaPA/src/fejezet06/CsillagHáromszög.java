public class CsillagHáromszög {
  public static void main(String[] args) {
    for(int i=1; i<=20; i++) { // sorozatszámítás programozási tétel
      for(int j=1; j<=2*i-1; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}

//public class CsillagHáromszög {
//  public static void main(String[] args) {
//    for(int i=1; i<=20; i++) { // sorozatszámítás programozási tétel 1-től 20-ig
//      for(double j=1; j<=i; j+=0.5) // sorozatszámítás a sorokon belül
//        System.out.print("*");
//      System.out.println();
//    }
//  }
//}
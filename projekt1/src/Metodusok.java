public class Metodusok {
  static int osszeg1(int n) {
    // sorozatszámítás
    int osszeg = 0;
    for (int i = n; i >= 1; i--) { //mindegy, hogy előre vagy hátra léptetünk
      osszeg += i;
    }
    return osszeg;
  } 
 
  static int osszeg2(int n) {
    // Gauss-módszer alkalmazása
    // n*(n+1) mindig páros, 2-vel osztva ezt egész számot kapunk, tehát maradhat int
    return n * (n + 1) / 2;
  }
  
  static int osszeg3(int n) {
    // rekurzív
    if (n == 0) {
      System.out.println("Alapeset, visszatérek nullával.");
      return 0;
    }
    System.out.print(n + " + összeg3(" + (n - 1) + ") -> ");
    return n + osszeg3(n - 1);  
  }
  
  public static void main(String[] args) {
    final int N = 100; //-100;
    System.out.println("1-től " + N + "-ig a számok összege");
    System.out.println(osszeg1(N));
    System.out.println(osszeg2(N));
    System.out.println(osszeg3(N));
  }
}

public class ElsőNÖsszege2 {

  static int elsőNÖsszege(int n) {
    return n*(n+1)/2;
  }

  public static void main(String[] args) {
    System.out.println("Első N természetes szám összege");
    int n=extra.Console.readInt("N = ");
    if(n>=0)
      System.out.println("Összeg = "+elsőNÖsszege(n));
    else
      System.out.println("N negatív!");
  }
}
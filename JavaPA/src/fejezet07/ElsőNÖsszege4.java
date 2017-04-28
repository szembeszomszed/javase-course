public class ElsőNÖsszege4 {

  static int elsőNÖsszege(int n) {
    if(n==0)
      return 0;
    return elsőNÖsszege(n-1)+n;
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
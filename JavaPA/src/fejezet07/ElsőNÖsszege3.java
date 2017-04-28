public class ElsőNÖsszege3 {

  static int elsőNÖsszege(int n) {
    int összeg=0;
    for(int i=0; i<=n; i++)
      összeg+=i;
    return összeg;
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
public class Faktoriális2 {

  static long faktoriális(int n) {
    long f=1;
    for(long i=1; i<=n; i++)
      f*=i;
    return f;
  }

  public static void main(String[] args) {
    System.out.println("n! kiszámítása");
    int n=extra.Console.readInt("n = ");
    if(n>=0)
      System.out.println(n+"! = "+faktoriális(n));
    else
      System.out.println("Negatív számnak nincs " +
        "faktoriálisa!");
  }
}
public class Faktoriális3 {

  // rekurzív - a függvény önmagát hívja meg - kényelmes, de memóriaigényes, mivel sok mindent kell tárolni
  static long faktoriális(int n) {                      //1
    if(n==0)                                            //2
      return 1;                                         //3
    return n*faktoriális(n-1);                          //4
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
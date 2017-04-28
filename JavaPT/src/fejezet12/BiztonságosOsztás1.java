public class BiztonságosOsztás1 {
  public static void main(String[] args) {
    int a, b;                                           //1
    try {                                               //2
      a=extra.Console.readInt("Osztandó: ");
      b=extra.Console.readInt("Osztó: ");
      System.out.println(a+"/"+b+": "+a/b);             //3
    }
    catch(ArithmeticException e) {                      //4
      e.printStackTrace();                              //5
      
      // felhasználónak ilyen menjen:
      // System.out.println("Hibakód: 1342525243");
    }
  }
}
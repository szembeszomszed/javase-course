public class BiztonságosOsztás2 {
  public static void main(String[] args) {
    double a=extra.Console.readDouble("Osztandó: ");
    double b=extra.Console.readDouble("Osztó: ");
    try {
      double c=a/b;                                     //1
      if(Double.isInfinite(c))                          //2
        throw new IllegalArgumentException("Az osztó 0!");
      System.out.println("Hányados: "+c);               //3
    }
    catch(IllegalArgumentException e) {                 //4
      System.out.println(e.getMessage());               //5
    }
  }
}
public class MinimumokDemo {

  static int min(int a, int b) {
    int min;
    if(a<b)
      min=a;
    else
      min=b;
    System.out.println("egész min("+a+", "+b+") -> "+min);
    return min;
  }

  static double min(double a, double b) {
    double min=(a<b)?a:b;
    System.out.println("valós min("+a+", "+b+") -> "+min);
    return min;
  }

  static int min(int a, int b, int c) {
    int min=min(a, min(b, c));
    System.out.println("egész min("+a+", min("+b+", "+c+")) -> "+min);
    return min;
  }

  static double min(double a, double b, double c) {
    double min=min(a, min(b, c));
    System.out.println("egész min("+a+", min("+b+", "+c+")) -> "+min);
    return min;
  }

  static int min(int a, int b, int c, int d) {
    int min=min(a, min(b, c, d));
    System.out.println("egész min("+a+", min("+b+", "+c+", "+d+")) -> "+min);
    return min;
  }

  static double min(
      double a, double b, double c, double d) {
    return min(min(a, b), min(c, d));
    //ez maga nem üzen, de a meghívott metódusok üzennek
  }

  public static void main(String[] args) {
  /*
    System.out.println("5 és 12 közül a kisebb: "+
      min(5, 12)+"\n");
    System.out.println("5.6 és 12 közül a kisebb: "+
      min(5.6, 12)+"\n");
    System.out.println("5.6 és 2.1 közül a kisebb: "+
      min(5.6, 2.1)+"\n");
    System.out.println("5 és 4 és 12 közül a legkisebb: "+
      min(5, 4, 12)+"\n");
  */
    System.out.println("5 és 4 és 12 és 6 közül a" +
      " legkisebb: "+min(5, 4, 12, 6));
  }
}
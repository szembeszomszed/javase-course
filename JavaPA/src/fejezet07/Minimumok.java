public class Minimumok {

  static int min(int a, int b) {
    int min;
    if(a<b)
      min=a;
    else
      min=b;
    return min;                                         //1
  }

  static double min(double a, double b) {
    return (a<b)?a:b;                                   //2
  }

  static int min(int a, int b, int c) {
    return min(a, min(b, c));                           //3
  }

  static double min(double a, double b, double c) {
    return min(a, min(b, c));                           //4
  }

  static int min(int a, int b, int c, int d) {
    return min(a, min(b, c, d));                        //5
  }

  static double min(
      double a, double b, double c, double d) {
    return min(min(a, b), min(c, d));                   //6
  }

  public static void main(String[] args) {
    System.out.println("5 és 12 közül a kisebb: "+
      min(5, 12));
    System.out.println("5.6 és 12 közül a kisebb: "+
      min(5.6, 12));
    System.out.println("5.6 és 2.1 közül a kisebb: "+
      min(5.6, 2.1));
    System.out.println("5 és 12 és 4 közül a legkisebb: "+
      min(5, 12, 4));
    System.out.println("5 és 12 és 4 és 6.5 közül a" +
      " legkisebb: "+min(5, 12, 4, 6.5));
  }
}
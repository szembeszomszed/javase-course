/**
 * húsvétszámítás 1900 és 2099 között
 * @author mate
 */
public class Feladat5311_Husvet {
  public static void main(String[] args) {
    System.out.println("Húsvétszámítás.");
    int year = extra.Console.readInt("Adja meg az évet: ");
    if (year >= 1900 && year <= 2099) {
      final int M = 24;
      final int N = 5;
      int a = year % 19;
      int b = year % 4;
      int c = year % 7;
      int d = (19 * a + M) % 30;
      int e = (2 * b + 4 * c + 6 * d + N) % 7;
      if ((d + e) < 10) {
        System.out.println("Ebben az évben húsvét vasárnap: március " + (d + e + 22) + ".");
      } else {
        int dayApr = d + e - 9;
        switch (dayApr) {
          case 25: System.out.println("Ebben az évben húsvét vasárnap: április 18."); break;
          case 26: System.out.println("Ebben az évben húsvét vasárnap: április 19."); break;
          default: System.out.println("Ebben az évben húsvét vasárnap: április " + (d + e - 9) + ".");
        }          
      }
    } else {
      System.out.println("Ezt az évet most nem fogjuk megvizsgálni.");
    }    
  }
}

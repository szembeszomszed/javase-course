public class Szökőévek2 {

  static boolean szökőév(int év) {
    return (év>=1582) &&
      ((év%4==0 && év%100!=0) || (év%400==0));
  }

  static void szökőévek(int a, int b) {
    System.out.println("Szökőévek "+a+" és "+b+" között:");
    for(int év=a; év<=b; év++)
      if(szökőév(év))
        System.out.print(év+", ");
  }

  public static void main(String[] args) {
    szökőévek(1977, 2009);
  }
}
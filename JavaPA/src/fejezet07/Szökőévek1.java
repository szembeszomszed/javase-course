public class Szökőévek1 {

  static boolean szökőév(int év) {
    return (év>=1582) &&
      ((év%4==0 && év%100!=0) || (év%400==0));
  }
  
  public static void main(String[] args) {
    System.out.println("Szökőévek 1880 és 1930 között:");
    for(int év=1880; év<=1930; év++)
      if(szökőév(év))
        System.out.print(év+", ");
  }
}
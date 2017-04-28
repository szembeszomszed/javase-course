public class MegelőzőKövetkezőSzám {
  public static void main(String[] args) {
    System.out.println("Előző és következő szám");
    int szám = extra.Console.readInt("Szám: ");
    if(szám>=0 && szám<10) {                            //1
      System.out.println("A megelőző szám: "+(szám-1)); //2
      System.out.println("A következő szám: "+(szám+1));
    }
  }
}
public class KétjegyűSzám {
  public static void main(String[] args) {
    System.out.println("Kétjegyű-e a szám?");
    int x=extra.Console.readInt("Szám: ");
    if(x>=10 && x<=99)
      System.out.println("A szám kétjegyű.");
    else
      System.out.println("A szám nem kétjegyű.");
  }
}
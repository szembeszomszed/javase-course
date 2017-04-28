public class LegkisebbSzám {
  public static void main(String[] args) {
    System.out.println("Melyik a legkisebb szám?");
    int a=extra.Console.readInt("1. szám: ");
    int b=extra.Console.readInt("2. szám: ");
    int c=extra.Console.readInt("3. szám: ");
    int legkisebb=Math.min(a, Math.min(b, c));
    System.out.println("A legkisebb szám: "+legkisebb);
  }
}
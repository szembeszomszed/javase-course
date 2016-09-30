/**
 * bekért számok összehasonlítása, majd közéjük relációjel elhelyezése
 * @author mate
 */
public class Feladat5312_KisebbNagyobbEgyenloRelacio {
  public static void main(String[] args) {
    System.out.println("Két szám összehasonlítása.");
    int a = extra.Console.readInt("a = ");
    int b = extra.Console.readInt("b = ");
    if (a > b)
      System.out.println(a + " > " + b);
    else if (a == b)
      System.out.println(a + " = " + b);
    else
      System.out.println(a + " < " + b);
  }
}

public class Haromszog {
  public static void main(String[] args) {
    // csoportos változódeklarálás
    System.out.println("Háromszög kerülete, területe");
    int a, b, c;
    // elöltesztelő ciklus
    // értékadás és vizsgálat egyben
    while ((a = extra.Console.readInt("a= ")) <= 0)
      System.out.println("Hiba! Nem pozitív. Újra!");
    while ((b = extra.Console.readInt("b= ")) <= 0)
      System.out.println("Hiba! Nem pozitív. Újra!");
    while ((c = extra.Console.readInt("c= ")) <= 0)
      System.out.println("Hiba! Nem pozitív. Újra!");
    if (/*a > 0 && b > 0 && c > 0 &&*/ a + b > c && a + c > b && b + c > a) {      
      int kerulet = a + b + c;
      System.out.println("K= " + 
              extra.Format.left(kerulet, 0, 2));
        // típuskényszerítés a művelet idejére
        double s = (double) kerulet / 2; //1.0 * kerulet / 2; //kerulet / 2.0;
        //System.out.println(s);

        // Héron-képlet használata a terület kiszámítására
        double terulet = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("T= " + 
                extra.Format.left(terulet, 0, 2)); // 0: az egész rész annyi helyre íródik ki, ahány helyre kifér, a 2 adja meg a tizedesjegyek számát
    }
    else {
      System.out.println("Hiba! Nincs háromszög.");
    }
  }
}

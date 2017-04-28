public class Prim {
  // osztályváltozó
  static int lepesszam = 0;
  
  // a main statikus, ezért a belőle hívott metódusoknak is statikusnak kell lenniük
  static boolean prim(int szam) {
    
    if (szam < 2)
      return false; // kiugrunk
    if (szam == 2)
      return true; // hogy ne maradjon ki a 2, azt hozzádobjuk
    if (szam % 2 == 0)
      return false; // 2-nél nagyobb párosok kizárása
    
    int osztoDb = 1; //0; // megszámolás
    // a for kilépési feltételét szigorítjuk, hogy amint több osztót talál, ne fusson le
    for (int i = 3 /*2*/ /*1*/; i <= Math.sqrt(szam) && osztoDb == 1 /*szam*/; i += 2 /*i++*/) {
      // ez a változó túléli a ciklust, és az összes ciklusfuttatáskor növeljük
      lepesszam++;
      if (szam % i == 0) { // kiválogatás
        osztoDb++;
      }
    }    
    return (osztoDb == 1); //2);
  }
  
  // konvenció szerint a main az utolsó metódus a sorban
  public static void main(String[] args) {
    System.out.println("1-től 100-ig a prímszámok");
    for (int i = 0; i <= 100; i++) { // sorozatszámítás
      // függvényhívás - minden léptetésnél megtörténik
      // kiválogatás programozási tétel; else ág itt nincs, hiszen a nemprímekkel nem foglalkozunk
      if (prim(i)) {
        System.out.print(i + ", ");
      }
    }
    System.out.println("\nLépésszám: " + lepesszam);
    // 5050, 525, 240, 87   
  }  
}

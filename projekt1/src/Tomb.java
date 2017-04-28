
public class Tomb {

  static int[] tömb = new int[10];

  static void feltoltLista() {
    System.out.println("A tömb elemei: ");
    int szám;
    for (int i = 0; i < tömb.length; i++) {
      szám = (int) (Math.random() * 90 + 10);
      tömb[i] = szám;
      System.out.print(tömb[i] + ", ");
    }
    System.out.println();
  }

  static void feladat1() {
    System.out.print("A prímszámok listája: ");
    int i = 0;
    while (i < tömb.length) {
      // meghívjuk a korábban létrehozott Prim osztály prim() függvényét
      if (Prim.prim(tömb[i])) {
        System.out.print(tömb[i] + ", ");
      }
      i++;
    }
    System.out.println();
  }

  static void feladat2() {
    System.out.println("A sorozat számainak összege: ");
    int osszeg = 0; // a típusnak igazodnia kell a tömb elemeihez
    for (int i = 0; i <= tömb.length - 1; i++) {
      osszeg += tömb[i];
    }
    System.out.println(osszeg);
  }

  static void feladat3() {
    System.out.print("Melyik a legkisebb szám? ");
    int minErtek = tömb[0];
    //System.out.println("A kezdeti minErtek: " + minErtek);
    for (int i = 0; i < tömb.length; i++) {
      //System.out.println("összehasonlítás: "
      //        + tömb[i] + " < " + minErtek + " ?");
      if (tömb[i] < minErtek) {
        minErtek = tömb[i];
        //System.out.println("Az eddigi számok minimuma: " + minErtek);
      }
    }
    System.out.println(minErtek);
  }

  static void feladat4() {
    System.out.println("A páratlan számok duplája kigyűjtve: ");
    int paratlanDb = 0;
    for (int i = 0; i < tömb.length; i++) {
      if (tömb[i] % 2 == 1) {
        ++paratlanDb;
      }
    }
    //System.out.println(paratlanDb);
    int[] segedTomb = new int[paratlanDb];
    int j = 0;
    for (int i = 0; i < tömb.length; i++) {
      if (tömb[i] % 2 == 1) {
        // a segedTomb j-edik helyére tesszük a számot, majd léptetjük is rögtön a j-t
        segedTomb[j++] = tömb[i] * 2;
        //j++;
      }
    }
    // újrahasznosítjuk a j változót, így nem kell újat deklarálni
    for (j = 0; j < paratlanDb; j++) {
      System.out.print(segedTomb[j] /**
               * 2
               */
              + ", ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    feltoltLista();
    //feladat1();
    //feladat2();
    //feladat3();
    //feladat4();
    
    System.out.println("\nMenü\n 1 - Feladat1\n 2 - Feladat2\n" + 
            " 3 - Feladat3\n 4 - Feladat4\n 0 - Kilépés");
    char valasz;
    do {
      valasz = extra.Console.readChar("Válasz: ");
    // a 0 és 4 karakter ASCII kódjára vizsgálunk - ez a char type-ból következik, hiszen ez itt nem szám
    } while(valasz < '0' || valasz > '4');
    
    switch (valasz) {
      case '1': feladat1(); break;
      case '2': feladat2(); break;
      case '3': feladat3(); break;
      case '4': feladat4(); break;
      default: System.exit(0);
    }
  }
}

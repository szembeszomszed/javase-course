package haromszog;

import java.io.Serializable;
import java.util.Arrays;

// az összehasonlíthatóság szempontjából itt az a lényeg, hogy valamilyen ősosztály tartalmazza az adott tulajdonságokat
// a Comparable interfészt implementáljuk
// a Serializable csak egy marker interface, teljesen üres, de jelöli, hogy az adott objektum bír ezzel a tulajdonsággal
// vele adunk engedélyt pl az objektum fájlbaírására

public class Haromszog implements Comparable<Haromszog>, Serializable /*extends Object */{ // szakértő, Plain Old Java Object (POJO)
  // az Object ősosztály, implicit, tehát mindenkié
  private int a;
  private int b;
  private int c;
  
  // ctrl + space-szel segít a netbeans létrehozni a konstruktort
  // beleírtuk a throws-t is utólag, mert így okosabb és szebb lesz a dolog
  public Haromszog(int a, int b, int c) throws IllegalArgumentException {
    if (a <= 0) {
      // bedobjuk az eseménykezelő láncba - itt vagy elkapjuk, vagy elnyeljük, vagy logoljuk
      throw new IllegalArgumentException("Hiba! a <= 0"); // egyébként saját hibakódot illik írni
    }
    if (b <= 0) {
      throw new IllegalArgumentException("Hiba! b <= 0"); // egyébként saját hibakódot illik írni
    }
    if (c <= 0) {
      throw new IllegalArgumentException("Hiba! c <= 0"); // egyébként saját hibakódot illik írni
    }
    if (!megszerkesztheto(a, b, c)) {
      throw new IllegalArgumentException("Hiba! Nincs háromszög.");
    }    
    
    this.a = a;
    this.b = b;
    this.c = c;
  }
  // a this-szel lehet hivatkozni a memóriacímre, ahol a példány létrejön (?)
  
  // ctrl + space
  // példánymetódus, hisz nincs előtte a static
//  public int getA() {
//    return a;
//  }
  
  // alt + insert (insert code)
  // getter metódusok
  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  @Override // felülírja az ősosztály metódusát
  // toString-et csak fejlesztés közben szokás használni, hiszen az ügyfél nem ebben a formában kapja majd meg az outputot
  public String toString() {
    return "Háromszög{a = " + a + ", b = " + b + ", c = " + c + 
            ", K = " + kerulet() + ", T = " + terulet() + "}";
  }  
  
  public int kerulet() {
   return a + b + c;
  }
  
  public double terulet() {
    double s = (a + b + c) / 2.0; //kerulet() / 2.0; // hogy biztosan double legyen 
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  } 
  
  // static - osztálymetódus, így nem az objektumtól (példánytól) függ majd, és belülről lehet csak hozzáférni
  // a megszerkesztheto belülről hívható függvény lesz, általános választ ad, és ha az nemleges, akkor nem készül példány
  private static boolean megszerkesztheto (int a, int b, int c) {
    return (a + b > c && a + c > b && b + c > a);    
  }

  // túlterhelt metódusok - mindkettő használva lehetne
//  @Override
//  public boolean equals(Object o) {
//    return true;
//  }
  
  public boolean equals(Haromszog h) {
    int[] h1Oldalai = {a, b, c};
    int[] h2Oldalai = {h.getA(), h.getB(), h.getC()};
    // Arrays osztály sort metódusa - attól még drága a rendezés, hogy nem mi írjuk meg
    // Arrays-hez kellhet import!
    Arrays.sort(h1Oldalai);
    Arrays.sort(h2Oldalai);
    // System.out.println(h1Oldalai);
    // [I@7852e922 - int típusú tömb@memóriacím
    int parDb = 0;
    // ciklusból nem elegáns kiugrani returnnel, mert memóriaszivárgást okoz
    for (int i = 0; i < h1Oldalai.length; i++) {
      if (h1Oldalai[i] == h2Oldalai[i]) {
        parDb++;
      }
    }
    return (parDb == 3);
  }
  
  // implement miatt itt meg kell írni
  // a compareTo kell például az objektumok sorba rendezéséhez is (valamilyen szempont által)
  @Override
  public int compareTo(Haromszog h) {
    // -1 az kisebb, amelyikhez hasonlítom a másikat
    // 1 a hasonlított a kisebb
    double d1 = this.terulet();
    double d2 = h.terulet();
    // egymásba ágyazott ifek
    //return d1 < d2 ? -1 : d1 == d2 ? 0 : +1;
    // előjelfüggvényt használunk, és szépen csonkoljuk a számot, hogy megfelelő eredményt kapjunk, amivel aztán kezdhetünk valamit
    return (int) Math.signum(d1 - d2);
  }
}
public class Kivetel {
  public static void main(String[] args) {
    // System.out.println(1 / 0);
    // error - nagyon súlyos
    // exception - kevésbé súlyos
    
    // System.out.println(1.0 / 0);
    // a lebegőpontos osztás nem annyira kritikus, mint az egész
    // a processzor amúgy egész számokkal dolgozna
    // ez így nem kivétel
    
    // System.out.println(Math.sqrt(-3));
    // System.out.println((int) Math.pow(2, 31));
    // System.out.println((int) Math.pow(2, 32));
    // az int 2 a 31.-en lehetne
    // ugyanaz az eredmény, ami nem jó természetesen
    
    
    // String irányítószám = "1119.8";
    // int szám = Integer.parseInt(irányítószám) + 1;
    // System.out.println(szám);
    // egész számmal működik, de mi van, ha mást gépel be?
    // a kivétel útja veremből van összeszedve
    // a radix a számrendszer alapszáma, pl 10
    // throws udvariassági formula - jelzi, hogy kivételt dob a cucc
    
    // Object o = null;
    // System.out.println(o);
    // System.out.println(o.toString());
    // típus nincs megadva, mégis kérdezek tőle képességet
    // konstruktor lefutása nélkül nem tudok az objektumhoz kérést intézni
    
    
    // ez int i = 5 valójában
    // Integer i = new Integer(5);
    // System.out.println((Double) i);
    // szintaktikailag hibás kód is tud dobni kivételt
    
    // alap kivételkezelés
    // több catch ág is lehet egymás után, csak azok másfélék lehetnek értelemszerűen
    
    // alapfogalmak:
    // throws - háttérben jelzés
    // try-catch-finally-throw
    // a catch ágak közül egy biztos lefut, ha a try blokkban kivétel keletkezett
    // ha nem, akkor egy catch sem fut le
    // a finally blokk mindenféleképpen végrehajtódik, bármi is történt előtte
    // a blokkok egymásba is ágyazhatók!
    
    // a kivételkezelés nagyon lassú
    // komplett vezérlést ráépíteni nem érdemes ezért
    // egy része mindig felesleges lesz (mint pl a marketingköltségek)
    // de bele kell tenni, használni kell
    
    
    try {
      
    } catch (Exception e) {
      
    }
  }
}

/**
 * véletlenszámok: kétjegyű páratlan, háromjegyű páros, hatoslottón megjátszható szám, negatív egyjegyű szám, szabályos kockával dobható szám, két szabályos kockával dobott számok összege
 * @author mate
 */
public class Feladat463_Veletlenszamok2 {
  public static void main(String[] args) {
    System.out.println("kétjegyű páratlan: " + ((int) (Math.random() * 45) * 2 + 11) + 
            "\nháromjegyű páros: " + ((int) (Math.random() * 450) * 2 + 100) + 
            "\nhatoslottón megjátszható: " + ((int) (Math.random() * 45) + 1) + 
            "\nnegatív egyjegyű: " + (int) (Math.random() * (9) -9) + 
            "\nszabályos kockával dobható: " + (int) (Math.random() * (6) + 1) + 
            "\nkét szabályos kockával dobható összeg: " + (int) (Math.random() * (11) + 2)    
    );
    
  }
}

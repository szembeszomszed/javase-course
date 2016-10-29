/**
 * példafeladat
 * @author mate
 */
public class Feladat821_ElemiProgramozasiTetelek {
  static final int N = 20;
  static int [] tomb = new int[N + 1];
  
  static void tombFeltolt() {
    for (int i = 1; i <= N - 1; i++) {
      tomb[i] = (int) (Math.random() * 90 + 10);      
     }
    // a tömb utolsó eleme páratlan kétjegyű szám
    tomb[N] = (int) (Math.random() * 45) * 2 + 11;
  }
  
  static void tombLista() {
    System.out.println("A tömb elemei: ");
    for (int i = 1; i < N; i++) {
      System.out.print(tomb[i] + ", ");      
    }
    System.out.println(tomb[N]);
  }
  
  static void osszegzes() {
    int osszeg = 0;
    for (int i = 1; i <= N; i++) {
      osszeg += tomb[i];
    }
    System.out.println("--- ÖSSZEGZÉS ---");
    System.out.println("A tömb elemeinek összege: " + osszeg);
  }
  
  static void eldontes() {
    System.out.println("--- ELDÖNTÉS ---");
    System.out.println("Van-e öttel osztható tömbelem?");
    int i = 1;
    while (i <= N && !(tomb[i] % 5 == 0)) {
      i++;
    }
    boolean van = (i <= N);
    System.out.println(van ? "Van." : "Nincs.");
  }
  
  static void kivalasztas() {
    int i = 1;
    while (i <= N && !(tomb[i] % 2 == 1)) {
      i++;      
    }
    System.out.println("--- KIVÁLASZTÁS ---");
    System.out.println("A tömb első páratlan eleme: " + tomb[i] + ", sorszáma: " + i + ".");
  }
  
  static void linearisKereses() {
    int i = 1;
    System.out.println("--- LINEÁRIS KERESÉS ---");
    System.out.println("Van-e a sorozatban 24? ");
    while (i <= N && !(tomb[i] == 24)) {
      i++;
    }
    boolean van = (i <= N);
    System.out.println(van ? "Van, az első sorszáma: " + i + "." : "Nincs.");    
  }
  
  static void megszamolas() {
    int i = 1, db = 0;
    while (i <= N) {
      if (tomb[i] % 2 == 0) {
        db++;
      }
      i++;
    }
    System.out.println("--- MEGSZÁMOLÁS ---");
    System.out.println("A tömb páros elemeinek száma: " + db + ".");
  }
  
  static void maximumKivalasztas() {
    int maxHely = 1, maxErtek = tomb[maxHely];
    for (int i = 2; i <= N; i++) {
      if (tomb[i] > maxErtek) {
        maxErtek = tomb[i];
        maxHely = i;
      }
    }
    System.out.println("--- MAXIMUMKIVÁLASZTÁS ---");
    System.out.println("A tömb elemei közül a legnagyobb: " + maxErtek + ", sorszáma: " + maxHely + ".");
  }
  
  public static void main(String[] args) {
    tombFeltolt();
    tombLista();
    osszegzes();
    eldontes();
    kivalasztas();
    linearisKereses();
    megszamolas();
    maximumKivalasztas();
  }
}

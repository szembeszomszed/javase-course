public class Évszak {
  public static void main(String[] args) {
    System.out.println("Hónap -> Évszak");
    int hónap = extra.Console.readInt("Hónap sorszáma: ");
    if(hónap>=1 && hónap<=12)
      switch(hónap) {
        case 1: case 2: case 12:
          System.out.println("Ez téli hónap."); break;
        case 3: case 4: case 5:
          System.out.println("Ez tavaszi hónap."); break;
        case 6: case 7: case 8:
          System.out.println("Ez nyári hónap."); break;
        case 9: case 10: case 11:
          System.out.println("Ez őszi hónap.");
      }
    else
      System.out.println("Hiba: érvénytelen hónap sorszám!");
  }
}
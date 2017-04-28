public class HónapNév {
  public static void main(String[] args) {
    System.out.println("Hónap sorszám -> Hónap szövegesen");
    int hónap = extra.Console.readInt("Hónap sorszáma: ");
    if(hónap>=1 && hónap<=12) {
      System.out.print(hónap+". hónap: ");
      switch(hónap) {
        case 1: System.out.print("január"); break;
        case 2: System.out.print("február"); break;
        case 3: System.out.print("március"); break;
        case 4: System.out.print("április"); break;
        case 5: System.out.print("május"); break;
        case 6: System.out.print("június"); break;
        case 7: System.out.print("július"); break;
        case 8: System.out.print("augusztus"); break;
        case 9: System.out.print("szeptember"); break;
        case 10: System.out.print("október"); break;
        case 11: System.out.print("november"); break;
        case 12: System.out.print("december");
      }
      System.out.println(".");
    }
    else
      System.out.println("Hiba: érvénytelen hónap sorszám!");
  }
}
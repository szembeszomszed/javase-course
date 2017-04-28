public class RómaiSzámjegyek {
  public static void main(String[] args) {
    System.out.println("Arab számjegy átváltása római számmá");
    int szám=extra.Console.readInt("Arab szám (1-9): ");
    if(szám>0 && szám<10) {
      System.out.print("Római szám: ");
      switch(szám) {
        case 1: System.out.println("I"); break;
        case 2: System.out.println("II"); break;
        case 3: System.out.println("III"); break;
        case 4: System.out.println("IV"); break;
        case 5: System.out.println("V"); break;
        case 6: System.out.println("VI"); break;
        case 7: System.out.println("VII"); break;
        case 8: System.out.println("VIII"); break;
        case 9: System.out.println("IX");
      }
    }
    else
      System.out.println("Túl kicsi vagy túl nagy szám!");
  }
}
public class Első10PozitívPárosSzám1 {
  public static void main(String[] args) {
    System.out.println("Az első 10 pozitív páros szám: ");
    for(int szám=2, db=0; db<10; szám+=2, db++)
      System.out.print(szám+", ");
  }
}
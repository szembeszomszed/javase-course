public class PárosSzámBeolvasása2 {
  public static void main(String[] args) {
    System.out.println("Páros szám "+
      "ellenőrzött beolvasása");
    int szám;
    while((szám=extra.Console.readInt("Szám: "))%2!=0)  //1
      System.out.println("Nem páros. Újra!");
    System.out.println("Elfogadva: "+szám);
  }
}
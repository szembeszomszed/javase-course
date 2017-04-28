public class KétjegyűSzámBeolvasása1 {
  public static void main(String[] args) {
    System.out.println("Kétjegyű pozitív szám "+
      "ellenőrzött beolvasása");
    int szám;
    while((szám=extra.
        Console.readInt("Szám: "))<10 || szám>=100)     //1
      System.out.println("Nem kétjegyű. Újra!");
    System.out.println("Elfogadva: "+szám);
  }
}
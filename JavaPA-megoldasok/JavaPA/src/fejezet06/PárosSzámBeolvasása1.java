public class PárosSzámBeolvasása1 {
  public static void main(String[] args) {
    System.out.println("Páros szám "+
      "ellenőrzött beolvasása");
    int szám;                                           //1
    szám=extra.Console.readInt("Szám: ");               //2
    while(szám%2!=0) {                                  //3
      System.out.println("Nem páros. Újra!");           //4
      szám=extra.Console.readInt("Szám: ");             //5
    }
    System.out.println("Elfogadva: "+szám);             //6
  }
}
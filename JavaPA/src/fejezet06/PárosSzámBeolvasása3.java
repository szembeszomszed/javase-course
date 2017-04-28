public class PárosSzámBeolvasása3 {
  public static void main(String[] args) {
    System.out.println("Páros szám "+
      "ellenőrzött beolvasása");
    int szám;                                           //1
    do {                                                //2
      szám=extra.Console.readInt("Szám: ");             //3
      if(szám%2!=0)                                     //4
        System.out.println("Nem páros. Újra!");         //5
    } while(szám%2!=0);                                 //6
    System.out.println("Elfogadva: "+szám);             //7
  }
}
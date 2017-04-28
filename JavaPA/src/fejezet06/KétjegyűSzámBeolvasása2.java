public class KétjegyűSzámBeolvasása2 {
  public static void main(String[] args) {
    System.out.println("Kétjegyű pozitív szám "+
      "ellenőrzött beolvasása");
    int szám;
    boolean ok;                                         //1
    do {                                                //2
      szám=extra.Console.readInt("Szám: ");             //3
      ok=szám>=10 && szám<100;                          //4
      if(!ok)                                           //5
        System.out.println("Nem kétjegyű. Újra!");      //6
    } while(!ok);                                       //7
    System.out.println("Elfogadva: "+szám);
  }
}
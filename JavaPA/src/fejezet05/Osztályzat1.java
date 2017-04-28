public class Osztályzat1 {
  public static void main(String[] args) {
    System.out.println("Százalék -> Értékelés");
    int százalék = extra.Console.readInt("Százalék: ");
    if(százalék>=0 && százalék<=100) {                  //1
      if(százalék<60)                                   //2
        System.out.println("60% alatt elégtelen");
      else if(százalék<70)                              //3
        System.out.println("60%-70%-ig elégséges");
      else if(százalék<80)                              //4
        System.out.println("70%-80%-ig közepes");
      else if(százalék<90)                              //5
        System.out.println("80%-90%-ig jó");
      else                                              //6
        System.out.println("90% felett jeles");
    }                                                   //7
    else                                                //8
      System.out.println("Hiba: érvénytelen százalék!");
  }
}
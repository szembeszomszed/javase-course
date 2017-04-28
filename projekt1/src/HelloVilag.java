// public itt a programra vonatkozik
public class HelloVilag {
  // public itt a belépési pontra vonatkozik
  // static - osztálymetódus
  // main - belépési pont (főprogram)
  // void - nincs visszatérési érték, nem jelzi, hány dolgot oldunk meg
  // [] - tömbképző operátor
  public static void main(String[] args) {
    // {}-on belül utasítás van
    // System.in - bemeneti csatorna, a konzolról olvassuk be a dolgokat
    // System.out - konzolra írás
    // System.err - hibaüzenet, pirossal, keveredhet az out-tal
    // int változó deklarálása - 4 bájtos, csak 
    // \n sortörés
    
    int időtartam = 80;
    System.out.print("Elkez");
    System.out.println("dtem Javát tanulni,\n"+időtartam+" perce");
  }
}



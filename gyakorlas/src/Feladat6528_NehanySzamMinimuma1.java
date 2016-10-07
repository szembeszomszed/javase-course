/**
 * számok minimuma, 0 végjellel
 * @author mate
 */
public class Feladat6528_NehanySzamMinimuma1 {
  public static void main(String[] args) {
    System.out.println("Adjon meg számokat (0 végjellel), megnézzük a maximumukat!");
    int num;
    int min = 2147483647;
    int count = 0;
    final int ENDSIGN = 0;
    do {  
      num = extra.Console.readInt("Szám: ");
      if (num != 0) {
        if (num < min)
          min = num;
        count++;
      }      
    } while (num != ENDSIGN);
    if (count > 0)
      System.out.println("A megadott számok minimuma: " + min);
    else
      System.out.println("Lényegében nem adott meg számot!");    
  }  
}

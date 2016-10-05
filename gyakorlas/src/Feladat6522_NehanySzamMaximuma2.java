/**
 * bekért számok maximuma
 * @author mate
 */
public class Feladat6522_NehanySzamMaximuma2 {
  public static void main(String[] args) {
    System.out.println("Adjon meg számokat (0 végjellel), megnézzük a maximumukat!");
    int num;
    int max = -2147483648;
    int count = 0;
    final int ENDSIGN = 0;
    do {      
      num = extra.Console.readInt("szám = ");
      if (num != ENDSIGN)
        count++;
      if (num > max) 
        max = num;      
    } while (num != ENDSIGN);
    if (count > 0)
      System.out.println("A megadott számok maximuma: " + max);
    else
      System.out.println("Lényegében nem adott meg számot!");    
  }
}

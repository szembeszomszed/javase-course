/**
 * bekért számok összege
 * @author mate
 */
public class Feladat6521_NehanySzamOsszege2 {
  public static void main(String[] args) {
    System.out.println("Összeadás! Adjon meg számokat, és 0-val jelezze, ha nem kíván többet megadni!");
    int num;
    int sum = 0;
    int count = 0;    
    final int ENDSIGN = 0;
    do {      
      num = extra.Console.readInt("szám = ");
      if (num != ENDSIGN) {
        sum += num;
        count++;         
      }     
    } while (num != ENDSIGN);    
      System.out.println("A kapott " + count + " szám összege: " + sum);
  }
}

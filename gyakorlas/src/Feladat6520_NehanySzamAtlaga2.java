/**
 * bekért számok átlaga
 * @author mate
 */
public class Feladat6520_NehanySzamAtlaga2 {
  public static void main(String[] args) {
    System.out.println("Átlagszámítás! Adjon meg számokat, és 0-val jelezze, ha nem kíván többet megadni!");
    int num;
    int sum = 0;
    int count = 0;
    double average = 0;
    final int ENDSIGN = 0;
    do {      
      num = extra.Console.readInt("szám = ");
      if (num != ENDSIGN) {
        sum += num;
        count++; 
        average = sum / count;
      }     
    } while (num != ENDSIGN);    
    if (count > 0) {
      System.out.println("A kapott " + count + " szám átlaga: " + average);
    } else {
      System.out.println("Ennél azért több számra lesz szükség!");
    }    
  }
}

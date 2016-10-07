/**
 * megadott darabszámú számok minimuma
 * @author mate
 */
public class Feladat6529_NehanySzamMinimuma2 {
    public static void main(String[] args) {
    int num;
    int min = 2147483647;
    int count = 0; 
    final int PLAN = extra.Console.readInt("Adja meg, hány darab számot szeretne vizsgálni: ");
    
    if (PLAN > 0) {
      do {  
        num = extra.Console.readInt("Szám: ");        
        if (num < min)
          min = num;
        count++;             
      } while (count < PLAN);
      System.out.println("A megadott " + PLAN + " szám minimuma: " + min);      
    } else {
      System.out.println("Akkor viszlát!");
    }   
  }
}

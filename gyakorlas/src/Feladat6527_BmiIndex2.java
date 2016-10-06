/**
 * testmagasság kiértékelése bmi-vel
 * @author mate
 */
public class Feladat6527_BmiIndex2 {
  public static void main(String[] args) {
    System.out.println("Testmagasság kiértékelése.");
    double height, bmi, d;
    double weightLow = 1;
    double weightNormal = 1;
    double weightObese1 = 1;
    double weightObese2 = 1;
    boolean ok;
    final int LOW = 20;
    final int NORMAL = 25;
    final int OBESE1 = 30;
    final int OBESE2 = 40;
    do {      
      height = extra.Console.readDouble("Testmagasság [100-200] (cm): ");
      ok = height >= 100 && height <= 200;
      if (!ok)
        System.out.println("Nem jó magasságot adott meg. Újra!");
    } while (!ok);
    d = Math.pow(height / 100, 2);
    while (weightLow <= d * LOW) {
      weightLow++;
    }
    
    while (weightNormal <= d * NORMAL) {
      weightNormal++;
    }
    
    while (weightObese1 <= d * OBESE1) {
      weightObese1++;
    }
    
    while (weightObese2 <= d * OBESE2) {
      weightObese2++;
    }
    
    System.out.println("Aki " + height + " cm magas: " + 
   "\n" + weightLow + " kg alatt sovány, egyébként " + 
   "\n" + weightNormal + " kg alatt normál, egyébként " +
   "\n" + weightObese1 + " kg alatt túlsúlyos, egyébként " +
    "\n" + weightObese2 + " kg alatt elhízott, egyébként " +
    "\nkórosan elhízott");
    
  }
}

/**
 * testtömeg-index kiszámítása beolvasott adatok alapján
 * @author mate
 */
public class Feladat6526_BmiIndex1 {
  public static void main(String[] args) {
    System.out.println("Testtömeg-index kiszámítása.");
    int weight;
    double height, bmi, d;
    boolean ok;
    do {
      height = extra.Console.readInt("Magasság (cm): ");
      ok = height >= 100 && height <= 200;
      if (!ok)
        System.out.println("100 és 200 között adja meg!");
    } while (!ok);
    
    do {      
      weight = extra.Console.readInt("Testsúly (kg): ");
      ok = weight >= 40 && weight <= 150;
      if (!ok)
        System.out.println("40 és 150 között kéne lennie!");
    } while (!ok);
    
    d = Math.pow(height / 100, 2); 
    bmi = weight / d ;

    
    if (bmi < 20)
      System.out.println("Maga sovány!");
    else if (bmi < 25)
      System.out.println("Maga normál!");
    else if (bmi < 30)
      System.out.println("Maga túlsúlyos!");
    else if (bmi < 40)
      System.out.println("Maga elhízott!");
    else
      System.out.println("Maga kórosan elhízott!");
  }
}

/**
 * lnko és lkkt számítása kapott paraméterekből
 * @author mate
 */
public class Feladat7312_LnkoLkkt2 {
  static int lnko(int num1, int num2) {
    int rem = num1 % num2;
    while (rem != 0) {
      num1 = num2;
      num2 = rem;
      rem = num1 % num2;
    }    
    int lnko = num2;
    return lnko;
  }
  public static void main(String[] args) {
    int num1, num2;
    do {      
      num1 = extra.Console.readInt("Szám1 = ");
      if (num1 <= 0) {
        System.out.println("Pozitív számot adjon meg!");
      }
    } while (num1 <= 0);
    
    do {      
      num2 = extra.Console.readInt("Szám2 = ");
      if (num2 <= 0) {
        System.out.println("Pozitív számot adjon meg!");
      }
    } while (num2 <= 0);
    int mult = num1 * num2;
    int lkkt = mult / lnko(num1, num2);
    
    System.out.println("Legnagyobb közös osztó: " + lnko(num1, num2));
    System.out.println("Legkisebb közös többszörös: " + lkkt);
  }
}

/**
 * prímszám-e a kapott szám, illetve mi a hozzá legközelebb eső prímszám
 * @author mate
 */
public class Feladat736_LegkozelebbiPrimszam {
  static boolean prime(int num) {
//    int numOfDiv = 1;
//    for (int i = 2; i < Math.sqrt(num); i++) {
//      if (num % i == 0) {
//        numOfDiv++;
//      }
//    }
//    return (numOfDiv == 1);    
    
    int i = 2;    
    while (i <= Math.sqrt(num)) {
        if (num % i == 0) {
          return false;
        }
      i++;
    }
    return true;
  }
  
  static int nearestPrime(int num) {
    if (num < 2) {
      return 2;
    }
    int i = num;
    int j = num;
    while (!prime(i)) {
      i++;
    }    
    while (!prime(j)) {
      j--;
    }
    return (i - num > num - j ? j : i);    
  }
  
  public static void main(String[] args) {
    System.out.println(nearestPrime(10000));
  }
}

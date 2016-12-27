package primszamok;

public class Prim {
  public static boolean prim (int num) {
    int numOfDivs = 0;
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        numOfDivs++; 
      }
    }
    return numOfDivs == 1;
  }
}

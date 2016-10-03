/**
 * kétjegyű, öttel nem osztható számok többféle ciklussal
 * @author mate
 */
public class Feladat657_Ketjegyu5telNemOszthatoSzamok {
  public static void main(String[] args) {
    System.out.println("Kétjegyű, öttel nem osztható számok:");
    for (int i = 10; i < 100; i++) {
      if (i % 5 != 0)
        System.out.print(i + ", ");
    }
    System.out.println("");
    
    int j = 10;
    while (j < 100) {
      if (j % 5 != 0) {
        System.out.print(j + ", ");
      }
      j++;
    }
    System.out.println("");
    
    int k = 10;
    while (k < 100 && k % 5 != 0 ) {
      System.out.print(k + ", ");
      k++;
    }
    
  }
}

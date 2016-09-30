/**
 * kétjegyű öttel osztható számok
 * @author mate
 */
public class Feladat655_Ketjegyu5telOszthatoSzamok {
  public static void main(String[] args) {
    for (int i = 10; i < 100; i++) {
      if (i % 5 == 0) 
        System.out.print(i + " ");      
    }
    System.out.println("");    
    int j = 10;
    while (j < 100) {
      if (j % 5 == 0)
        System.out.print(j + " ");
      j++;
    }
    System.out.println("");
    for (int k = 2; k < 20; k++) 
      System.out.print(k * 5 + " ");    
    System.out.println("");
    int l = 10;
    while (l < 100) {
      System.out.print(l + " ");
      l += 5;
    }
    
  }
}

/**
 * számok 10-től 30-ig többféle for ciklussal
 * @author mate
 */
public class Feladat656_Szamok10tol30igForCiklusValtozatok {
  public static void main(String[] args) {
    System.out.println("Számok 10-től 30-ig");
    for (int i = 10; i <= 30; i++) {
      System.out.print(i + ", ");
    }
    System.out.println("");
    int a = 10;
    int b = 30;
    int c = a + b;    
    for (int i = b; i >= a; i-- ) {
      System.out.print(c - i + ", ");
    }
    System.out.println("");
    for (int i = 9; i < 30;) {
      System.out.print(++i + ", ");
    }
    
  }
}

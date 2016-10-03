/**
 * véletlenszerűen kitöltött totószelvény
 * @author mate
 */
public class Feladat6510_Toto34 {
  public static void main(String[] args) {
    for (int i = 1; i < 14; i++) {
      System.out.print(extra.Format.right(i, 3));      
    }
    System.out.print(" +1");
    System.out.println("");
    for (int j = 1; j <= 14; j++) {
      int bet = (int) (Math.random() * 3);
      if (bet == 0) {
        System.out.print(extra.Format.right("x", 3));
      } else {
        System.out.print(extra.Format.right(bet, 3));
      }      
    }
  }
}

/**
 * pitagoraszi számhármasok 1-től 50-ig
 * @author mate
 */
public class Feladat6512_PitagorasziSzamharmasok {
  public static void main(String[] args) {
    for (int i = 1; i <= 50; i++) {
      for (int j = 1; j <= 50; j++) {
        for (int k = 1; k <= 50; k++) {
          if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
            System.out.println(i + "^2 * " + j + "^2 = " + k + "^2");
          }
        }
      }
    }
  }
}

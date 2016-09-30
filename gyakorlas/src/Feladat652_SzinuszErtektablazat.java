/**
 * szinusz függvény értéktáblázata 180-ig ötösével
 *
 * @author mate
 */
public class Feladat652_SzinuszErtektablazat {
  public static void main(String[] args) {
    double sinX;
    for (int i = 0; i <= 180; i += 5) {
      
      System.out.print(extra.Format.left(i, 3, 0) + "   ");
      sinX = Math.sin(i);
      if (sinX >= 0) {
        System.out.print(" ");
      }
      System.out.println(extra.Format.right(sinX, 0, 4));
    }
  }
}

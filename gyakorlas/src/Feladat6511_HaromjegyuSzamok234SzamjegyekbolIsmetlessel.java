/**
 * háromjegyű számok 2-3-4 számjegyekből
 * @author mate
 */
public class Feladat6511_HaromjegyuSzamok234SzamjegyekbolIsmetlessel {
  public static void main(String[] args) {
    for (int i = 2; i <= 4; i++) {
      for (int j = 2; j <= 4; j++) {
        for (int k = 2; k <= 4; k++) {
          System.out.print("" + i + j + k + ", ");
        }
      }
    }
  }
}

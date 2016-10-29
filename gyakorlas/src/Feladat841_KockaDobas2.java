/**
 * két dobókockával történő dobások összegei
 * @author mate
 */
public class Feladat841_KockaDobas2 {
  public static void main(String[] args) {
    int numberOfRounds;
    while ((numberOfRounds = extra.Console.readInt("Dobások száma: ")) <= 0) {
      System.out.println("Nem pozitív. Újra!");
    }
    int cube1, cube2;
    final int N = 13;
    int [] result = new int[N];
    for (int i = 2; i < N; i++) {
      result[i] = 0;
    }
    for (int i = 1; i <= numberOfRounds; i++) {
      cube1 = (int) (Math.random() * 6 + 1);
      cube2 = (int) (Math.random() * 6 + 1);
      int sum = cube1 + cube2;
      result[sum]++;
    }
    System.out.println(numberOfRounds + " dobásból ");
    for (int i = 2; i <= 12; i++) {
      System.out.println(i + " volt: " + result[i] + " db.");
    }
  }
}

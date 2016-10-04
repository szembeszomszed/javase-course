/**
 * 1000-szer feldobott érme
 * @author mate
 */
public class Feladat6516_FejVagyIras1 {
  public static void main(String[] args) {
    System.out.println("Érmefeldobás.");
    int head = 0;
    int tail = 0;
    int result;
    for (int i = 1; i <= 1000; i++) {
      result = (int) (Math.random() * 2);
      if (result == 0) {
        head++;
      } else {
        tail++;
      }
    }
    System.out.println("Fej: " + head + "\nÍrás: " + tail);
  }
}

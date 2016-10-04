/**
 * 1000-szer feldobott érme, feltételes kiértékeléssel
 * @author mate
 */
public class Feladat6517_FejVagyIras2 {
  public static void main(String[] args) {
    System.out.println("Érmefeldobás.");
    int head = 0;
    int tail = 0;
    int result;
    for (int i = 1; i <= 1000; i++) {
      result = ((int) (Math.random() * 2) == 0 ? head++ : tail++) ;      
    }
    System.out.println("Fej: " + head + "\nÍrás: " + tail);
  }
}



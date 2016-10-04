/**
 * kétjegyű páros számok száma - kettesével léptetve
 * @author mate
 */
public class Feladat6515_KetjegyuParosSzamokSzama2 {
  public static void main(String[] args) {
    System.out.println("A kétjegyű páros számok száma: ");
    int sum = 0;
    for (int i = 10; i < 100; i += 2) {
      sum++;
    }
    System.out.print(sum);
    System.out.println("");
  }
}

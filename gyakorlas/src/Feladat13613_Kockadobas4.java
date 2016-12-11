
import java.util.ArrayList;


public class Feladat13613_Kockadobas4 {
  public static void main(String[] args) {
    ArrayList<Integer> collector = new ArrayList<>(11);
    for (int i = 0; i < 11; i++) {
      collector.add(0);
    }
    
    int count;    
    do {      
      count = extra.Console.readInt("Dobások kívánt száma: ");
      if (count <= 0) {
        System.out.println("Nem pozitív, újra!");
      }
    } while (count <= 0);
    
    int cube1;
    int cube2;
    int i = 1;
    int sum;
    
    while (i <= count) {
      cube1 = (int) (Math.random() * 6 + 1);
      cube2 = (int) (Math.random() * 6 + 1);
      sum = cube1 + cube2;
      collector.set(sum - 2, collector.get(sum - 2) + 1);
      i++;
    }
    
    System.out.println("A kockadobások összegének előfordulásai: ");
    int j = 2;
    for (Integer element : collector) {
      System.out.print(j + ": " + element + "db, ");
      j++;
    }    
  }
}


import java.util.ArrayList;
import java.util.Collections;

public class Feladat1362_Keno3 {

  public static void main(String[] args) {
    ArrayList<Integer> kenoVektor = new ArrayList<Integer>();
    while (kenoVektor.size() < 7) {
      int tipp = (int) (Math.random() * 35 + 1);
      if (!kenoVektor.contains(tipp)) {
        kenoVektor.add(tipp);
      }
    }
    Collections.sort(kenoVektor);                      //2
    System.out.print("Kenón megjátszható számok: ");
    System.out.println(kenoVektor);
  }
}

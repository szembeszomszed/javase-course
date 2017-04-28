import java.util.Collections;                           //1
import java.util.Vector;

public class Ötöslottó8 {
  public static void main(String[] args) {
    Vector<Integer> lottóVektor=new Vector<Integer>();
    while(lottóVektor.size()<5) {
      int tipp=(int)(Math.random()*90+1);
      if(!lottóVektor.contains(tipp))
        lottóVektor.add(tipp);
    }
    Collections.sort(lottóVektor);                      //2
    System.out.print("Ötöslottón megjátszható számok: ");
    System.out.println(lottóVektor);
  }
}
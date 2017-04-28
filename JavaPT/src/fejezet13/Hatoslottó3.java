import java.util.*;

public class Hatoslottó3 {

  public static void main(String[] args) {
    Vector<Integer> tippelhetőSzámok=new Vector<Integer>(45);
    for(int i=1; i<=45; i++)
      tippelhetőSzámok.add(i);
    Vector<Integer> lottóVektor=new Vector<Integer>(6);
    while(lottóVektor.size()<6) {
      int tipp=(int)(Math.random()*45+1);
      if(tippelhetőSzámok.contains(tipp)) {
        lottóVektor.add(tipp);
        tippelhetőSzámok.remove(tipp);
      }
    }
    Collections.sort(lottóVektor);
    System.out.println(
      "Hatoslottón megjátszható számok: "+lottóVektor);
  }
}
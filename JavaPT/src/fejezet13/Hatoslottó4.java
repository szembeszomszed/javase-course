import java.util.*;

public class Hatoslottó4 {

  public static void main(String[] args) {
    Vector<Integer> tippelhetőSzámok=new Vector<Integer>(45);
    for(int i=1; i<=45; i++)
      tippelhetőSzámok.add(i);
    Vector<Integer> lottóVektor=new Vector<Integer>(6);
    for(int tippDb=1; tippDb<=6; tippDb++) {
      int tippIndex=(int)(Math.random()*tippelhetőSzámok.size());
      int tipp=tippelhetőSzámok.get(tippIndex);
      lottóVektor.add(tipp);
      tippelhetőSzámok.remove(tippIndex);
    }
    Collections.sort(lottóVektor);
    System.out.println(
      "Hatoslottón megjátszható számok: "+lottóVektor);
  }
}
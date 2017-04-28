import java.util.*;

public class Kenó3 {

  public static void main(String[] args) {
    Vector<Integer> kenóVektor=new Vector<Integer>();
    while(kenóVektor.size()<10) {
      int tipp=(int)(Math.random()*80+1);
      if(!kenóVektor.contains(tipp))
        kenóVektor.add(tipp);
    }
    Collections.sort(kenóVektor);
    System.out.println("Kenón megjátszható számok: "+
      kenóVektor);
  }
}
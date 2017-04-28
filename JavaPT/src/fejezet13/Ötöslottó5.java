import java.util.Vector;

public class Ötöslottó5 {
  public static void main(String[] args) {
    Vector lottóVektor=new Vector();
    while(lottóVektor.size()<5) {
      Integer tipp=
        new Integer((int)(Math.random()*90+1));
      if(!lottóVektor.contains(tipp))                   //1
        lottóVektor.add(tipp);
    }
    System.out.print("Ötöslottón megjátszható számok: ");
    for(Object lottószám: lottóVektor)                  //2
      System.out.print(lottószám+", ");                 //3
  }
}
import java.util.Vector;

public class Ötöslottó7 {
  public static void main(String[] args) {
    Vector<Integer> lottóVektor=new Vector<Integer>();  //1
    while(lottóVektor.size()<5) {
      int tipp=(int)(Math.random()*90+1);
      if(!lottóVektor.contains(tipp))                   //2
        lottóVektor.add(tipp);
    }
    System.out.println("Ötöslottón megjátszható számok: "+
      lottóVektor);
  }
}
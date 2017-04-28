import java.util.Vector;

public class Ötöslottó6 {
  public static void main(String[] args) {
    Vector lottóVektor=new Vector(5);                   //1
    while(lottóVektor.size()<5) {
      int tipp=(int)(Math.random()*90+1);               //2
      if(!lottóVektor.contains(tipp))
        lottóVektor.add(tipp);                          //3
    }
    System.out.print("Ötöslottón megjátszható számok: ");
    System.out.println(lottóVektor);                    //4
  }
}
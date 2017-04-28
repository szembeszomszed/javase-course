import java.util.Vector;                                //1

public class Ötöslottó4 {
  public static void main(String[] args) {
    Vector lottóVektor=new Vector();                    //2
    while(lottóVektor.size()<5) {                       //3
      Integer tipp=
        new Integer((int)(Math.random()*90+1));         //4
      if(lottóVektor.indexOf(tipp)==-1)                 //5
        lottóVektor.add(tipp);                          //6
    }
    System.out.print("Ötöslottón megjátszható számok: ");
    for(int i=0; i<lottóVektor.size(); i++)             //7
      System.out.print(
        ((Integer)lottóVektor.get(i)).intValue()+", "); //8
  }
}
import java.util.TreeSet;                               //1

public class Hatoslottó2 {
  public static void main(String[] args) {
    TreeSet lottóHalmaz=new TreeSet();                  //2
    while(lottóHalmaz.size()<6)
      lottóHalmaz.add((int)(Math.random()*45+1));
    System.out.println(
      "Hatoslottón megjátszható számok: "+lottóHalmaz);
  }
}
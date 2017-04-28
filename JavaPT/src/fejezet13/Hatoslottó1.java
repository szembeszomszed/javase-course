import java.util.HashSet;                               //1

public class Hatoslottó1 {
  public static void main(String[] args) {
    HashSet lottóHalmaz=new HashSet();                  //2
    while(lottóHalmaz.size()<6)                         //3
      lottóHalmaz.add((int)(Math.random()*45+1));       //4
    System.out.println(
      "Hatoslottón megjátszható számok: "+lottóHalmaz);
  }
}
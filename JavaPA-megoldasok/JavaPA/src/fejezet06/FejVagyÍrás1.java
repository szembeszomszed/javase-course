public class FejVagyÍrás1 {
  public static void main(String[] args) {
    System.out.print("Pénzérme 1000 db feldobásából ");
    int fejDb=0, írásDb=0, dobás;
    for(int db=1; db<=1000; db++) {
      dobás=(int)(Math.random()*2);
      if(dobás==1) // 1 -> fej
        fejDb++;
      else // 0 -> írás
        írásDb++;
    }  
    System.out.println(fejDb+" db fej és "+
      írásDb+" írás volt.");
  }
}
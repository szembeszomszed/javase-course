public class FejVagyÍrás3 {
  public static void main(String[] args) {
    System.out.print("Pénzérme 500 db feldobásából ");
    int fejDb=0, írásDb=0, dobás;
    for(int i=1; i<=500; i++)
      dobás=((int)(Math.random()*2)==1)?(fejDb++):(írásDb++);
    System.out.println(fejDb+" db fej és "+írásDb+" írás volt.");
  }
}
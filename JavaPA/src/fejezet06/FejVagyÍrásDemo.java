public class FejVagyÍrásDemo {
  public static void main(String[] args) {
    System.out.println("Pénzérme 1000 db feldobásából ");
    int fejDb=0, írásDb=0, dobás;
    for(int db=1; db<=1000; db++) {
      System.out.print(db+". dobás: ");
      dobás=(int)(Math.random()*2);
      if(dobás==1) { // 1 -> fej
        fejDb++;
        System.out.print("Fej.  ");
      }
      else { // 0 -> írás
        írásDb++;
        System.out.print("Írás. ");
      }
      System.out.println("Eddig "+fejDb+" db fej és "+írásDb+" írás volt.");
    }
    System.out.println("\n1000 dobásból "+fejDb+" db fej és "+írásDb+" írás volt.");

  }
}
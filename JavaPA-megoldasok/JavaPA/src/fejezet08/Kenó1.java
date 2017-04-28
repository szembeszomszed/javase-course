public class Kenó1 {
  public static void main(String[] args) {
    boolean[] logikaiTömb=new boolean[81];
    for(int i=1; i<=80; i++)
      logikaiTömb[i]=false;

    int jóSzámDb=1, tipp;
    while(jóSzámDb<=10) {
      tipp=(int)(Math.random()*80+1);
      if(!logikaiTömb[tipp]) {
        logikaiTömb[tipp]=true;
        jóSzámDb++;
      }
    }

    System.out.print("Kenón megjátszható számok: ");
    for(int i=1; i<=80; i++)
      if(logikaiTömb[i])
        System.out.print(i+" ");
  }
}
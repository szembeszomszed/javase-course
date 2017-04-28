public class Kenó2 {
  public static void main(String[] args) {
    int[] kenóTömb=new int[10];

    int tipp, j;
    for(int jóSzámDb=1; jóSzámDb<=10; jóSzámDb++) {
      do {
        tipp=(int)(Math.random()*80+1);
        j=0;
        while(j<jóSzámDb && !(kenóTömb[j]==tipp))
          j++;
      } while(j<jóSzámDb);
      kenóTömb[jóSzámDb-1]=tipp;
    }

    System.out.print("Kenón megjátszható számok: ");
    for(int i=0; i<kenóTömb.length; i++)
      System.out.print(kenóTömb[i]+" ");
  }
}
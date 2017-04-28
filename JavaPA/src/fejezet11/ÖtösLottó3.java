public class ÖtösLottó3 {
  public static void main(String[] args) {
    int[] lottóTömb=new int[5];

    int tipp, j;
    for(int jóSzámDb=1; jóSzámDb<=5; jóSzámDb++) {
      do {
        tipp=(int)(Math.random()*90+1);
        j=0;
        while(j<jóSzámDb && !(lottóTömb[j]==tipp))
          j++;
      } while(j<jóSzámDb);
      lottóTömb[jóSzámDb-1]=tipp;
    }

    int csere;
    for(int i=0; i<=3; i++)
      for(j=i+1; j<=4; j++)
        if(lottóTömb[i]>lottóTömb[j]) {
          csere=lottóTömb[i];
          lottóTömb[i]=lottóTömb[j];
          lottóTömb[j]=csere;
        }

    System.out.print("Ötöslottón megjátszható számok: ");
    for(int i=0; i<lottóTömb.length; i++)
      System.out.print(lottóTömb[i]+" ");
  }
}
public class ÖtösLottó2 {
  public static void main(String[] args) {
    int[] lottóTömb=new int[5];                         //1

    int tipp, j;                                        //2
    for(int jóSzámDb=1; jóSzámDb<=5; jóSzámDb++) {      //3
      do {                                              //4
        tipp=(int)(Math.random()*90+1);
        j=0;
        while(j<jóSzámDb && !(lottóTömb[j]==tipp))
          j++;
      } while(j<jóSzámDb);                              //5
      lottóTömb[jóSzámDb-1]=tipp;                       //6
    }

    System.out.print("Ötöslottón megjátszható számok: ");
    for(int i=0; i<lottóTömb.length; i++)               //7
      System.out.print(lottóTömb[i]+" ");               //8
  }
}
public class MátrixLegkisebbEleme {

  static final int N=7, M=10;
  static int[][] mátrix=new int[N+1][M+1];

  static void mátrixFeltölt() {
    for(int i=1; i<=N; i++)
      for(int j=1; j<=M; j++)
        mátrix[i][j]=(int)(Math.random()*10);
  }

  static void mátrixKiír() {
    for(int i=1; i<=N; i++) {
      for(int j=1; j<=M; j++)
        System.out.print(extra.Format.right(mátrix[i][j], 5));
      System.out.println();
    }
  }

  static void mátrixMinimum() {
    int minIndexSor=1, minIndexOszlop=1,
      minÉrték=mátrix[minIndexSor][minIndexOszlop];
    for(int i=1; i<=N; i++)
      for(int j=1; j<=M; j++)
        if(mátrix[i][j]<minÉrték) {
          minÉrték=mátrix[i][j];
          minIndexSor=i;
          minIndexOszlop=j;
        }
    System.out.println("A mátrix legkisebb eleme (sorfolytonosan az első): "+
      "A["+minIndexSor+"]["+minIndexOszlop+"] = "+minÉrték+".");
  }

  public static void main(String[] args) {
    mátrixFeltölt();
    System.out.println("A mátrix:");
    mátrixKiír();
    mátrixMinimum();
  }
}
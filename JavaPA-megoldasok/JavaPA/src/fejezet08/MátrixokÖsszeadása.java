public class MátrixokÖsszeadása {

  static final int N=3, M=4;                            //1
  static int[][] mátrixA=new int[N+1][M+1];             //2
  static int[][] mátrixB=new int[N+1][M+1];             //3
  static int[][] mátrixÖsszeg=new int[N+1][M+1];        //4

  static int[][] mátrixFeltölt() {                      //5
    int[][] mátrix=new int[N+1][M+1];                   //6
    for(int i=1; i<=N; i++)                             //7
      for(int j=1; j<=M; j++)                           //8
        mátrix[i][j]=(int)(Math.random()*31-10);        //9
    return mátrix;                                     //10
  }
  
  static void mátrixKiír(int[][] mátrix, String üzenet) {
    System.out.println("\n"+üzenet);
    for(int i=1; i<=N; i++) {
      for(int j=1; j<=M; j++)
        System.out.print(extra.Format.
          right(mátrix[i][j], 5));
      System.out.println(); 
    }
  }

  static int[][] mátrixÖsszead(
      int[][] m1, int[][] m2) {                        //11
    int[][] mátrix=new int[N+1][M+1];                  //12
    for(int i=1; i<=N; i++)
      for(int j=1; j<=M; j++)
        mátrix[i][j]=m1[i][j]+m2[i][j];                //13
    return mátrix;                                     //14
  }

  public static void main(String[] args) {
    mátrixA=mátrixFeltölt();
    mátrixB=mátrixFeltölt();
    mátrixKiír(mátrixA, "'A' mátrix:");
    mátrixKiír(mátrixB, "'B' mátrix:");
    mátrixÖsszeg=mátrixÖsszead(mátrixA, mátrixB);
    mátrixKiír(mátrixÖsszeg, "'A' + 'B' mátrix:");
  }
}
public class MátrixokSzorzása {

  static final int N=3;
  static int[][] mátrixA=new int[N+1][N+1];
  static int[][] mátrixB=new int[N+1][N+1];
  static int[][] mátrixSzorzat=new int[N+1][N+1];

  static int[][] mátrixFeltölt() {
    int[][] mátrix=new int[N+1][N+1];
    for(int i=1; i<=N; i++)
      for(int j=1; j<=N; j++)
        mátrix[i][j]=(int)(Math.random()*31-10);
    return mátrix;
  }

  static void mátrixKiír(int[][] mátrix, String üzenet) {
    System.out.println("\n"+üzenet);
    for(int i=1; i<=N; i++) {
      for(int j=1; j<=N; j++)
        System.out.print(extra.Format.
          right(mátrix[i][j], 5));
      System.out.println();
    }
  }

  static int[][] mátrixSzoroz(int[][] m1, int[][] m2) {
    int[][] mátrix=new int[N+1][N+1];
    int összeg;
    for(int i=1; i<=N; i++)
      for(int j=1; j<=N; j++) {
        összeg=0;
        for(int k=1; k<=N; k++)
          összeg+=m1[i][k]*m2[k][j];
        mátrix[i][j]=összeg;
      }
    return mátrix;
  }

  public static void main(String[] args) {
    mátrixA=mátrixFeltölt();
    mátrixB=mátrixFeltölt();
    mátrixKiír(mátrixA, "'A' mátrix:");
    mátrixKiír(mátrixB, "'B' mátrix:");
    mátrixSzorzat=mátrixSzoroz(mátrixA, mátrixB);
    mátrixKiír(mátrixSzorzat, "'A' * 'B' mátrix:");
  }
}
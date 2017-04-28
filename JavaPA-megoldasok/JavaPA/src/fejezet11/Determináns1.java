public class Determináns1 {

  static int determináns(int[][] mátrix) {
    return mátrix[0][0]*mátrix[1][1]-(mátrix[1][0]*mátrix[0][1]);
  }

  public static void main(String[] args) {
    int[][] mátrix = new int[2][2];
    mátrix[0][0]=1;
    mátrix[0][1]=2;
    mátrix[1][0]=-6;
    mátrix[1][1]=4;
    /*
     |  1 2 |
     | -6 4 |
    */
    System.out.println("A mátrix deteminánsa: "+determináns(mátrix));
  }
}
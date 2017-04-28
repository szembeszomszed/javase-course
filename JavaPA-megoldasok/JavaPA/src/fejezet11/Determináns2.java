public class Determináns2 {

  static int determináns(int[][] mátrix) {
    return mátrix[0][0]*mátrix[1][1]*mátrix[2][2] +
           mátrix[0][1]*mátrix[1][2]*mátrix[2][0] +
           mátrix[0][2]*mátrix[1][0]*mátrix[2][1] -
          (mátrix[0][2]*mátrix[1][1]*mátrix[2][0] +
           mátrix[0][1]*mátrix[1][0]*mátrix[2][2] +
           mátrix[0][0]*mátrix[1][2]*mátrix[2][1]);
  }

  public static void main(String[] args) {
    int[][] mátrix = new int[3][3];
    mátrix[0][0]=2;
    mátrix[0][1]=3;
    mátrix[0][2]=5;
    mátrix[1][0]=-4;
    mátrix[1][1]=5;
    mátrix[1][2]=6;
    mátrix[2][0]=-2;
    mátrix[2][1]=4;
    mátrix[2][2]=7;
    /*
| 2 3 5|
|-4 5 6| = 2×(5×7-4×6) - 3×[(-4)×7-(-2)×6] + 5×[(-4)×4-(-2)×6] = 50
|-2 4 7|

    */
    System.out.println("A mátrix deteminánsa: "+determináns(mátrix));
  }
}
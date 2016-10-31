/**
 * véletlenszámokkal feltöltött 7*10-es mátrix, illetve a legkisebb elem pozíciójának megjelölése
 * @author mate
 */
public class Feladat8311_MatrixLegkisebbEleme {
  static final int N = 7;
  static final int M = 10;
  static int[][] matrix = new int[N + 1][M + 1];
  static int[][] createMatrix() {
    int[][] matrixTemplate = new int[N + 1][M + 1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= M; j++) {
        matrixTemplate[i][j] = (int) (Math.random() * 20 + 1);
      }
    }
    return matrixTemplate;
  }
  static void displayMatrix(int[][] matrixToDisplay) {
    System.out.println("A mátrix: ");
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= M; j++) {
        System.out.print(extra.Format.right(matrixToDisplay[i][j] + " ", 4));
      }
      System.out.println("");
    }
  }
  
  static void findSmallestValue (int[][] matrix) {
    int row = 1, column = 1;
    int minValue = matrix[row][column]; // a mátrix első pozícióját jelöljük meg legkisebbnek
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= M; j++) {
        if (matrix[i][j] < minValue) { // ugyan minden pozícióban lefut, de csak akkor írja felül az előzőt, ha az kisebb volt - így mindig az első előfordulást jelöli meg
          minValue = matrix[i][j];
          row = i;
          column = j;
        }
      }
    }
    System.out.println("A mátrix legkisebb értéke: " + minValue + ".\nAz első pozíciója: " + row + ". sor " + column + ". oszlop.");
  }   
  
  public static void main(String[] args) {
    matrix = createMatrix();
    displayMatrix(matrix);
    findSmallestValue(matrix);
  }
}

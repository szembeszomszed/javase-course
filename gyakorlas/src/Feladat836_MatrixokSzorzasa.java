/**
 * két véletlenszerűen előállított négyzetes mátrix szorzata metódusokkal
 * @author mate
 */
public class Feladat836_MatrixokSzorzasa {
  static final int N = 5;
  static int[][] matrix1 = new int[N + 1][N + 1];
  static int[][] matrix2 = new int[N + 1][N + 1];
  static int[][] matrixMultiplied = new int[N + 1][N + 1];
  
  static int [][] createMatrix() {
    int[][] matrixTemplate = new int[N + 1][N + 1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        matrixTemplate[i][j] = (int) (Math.random() * 20 - 10);
      }
    }
    return matrixTemplate;
  }
  
  static void displayMatrix(int[][] m, String message) {
    System.out.println(message);
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        System.out.print(extra.Format.right(m[i][j], 4));
      }
      System.out.println("");
    }
  }
  
  static int [][] matrixMultiplier(int[][] m1, int [][] m2) {
    int[][] matrixMultipliedTemplate = new int[N + 1][N + 1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        matrixMultipliedTemplate[i][j] = m1[i][j] * m2[i][j];
      }
    }
    return matrixMultipliedTemplate;
  }
  
  public static void main(String[] args) {
    matrix1 = createMatrix();
    matrix2 = createMatrix();
    displayMatrix(matrix1, "Mátrix 1");
    displayMatrix(matrix2, "Mátrix 2");
    matrixMultiplied = matrixMultiplier(matrix1, matrix2);
    displayMatrix(matrixMultiplied, "A két mátrix szorzata");
  }
}

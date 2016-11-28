
/**
 *
 * @author mate
 */
public class Feladat1142_Determinans2 {

  public static int[][] loadMatrix() {
    int[][] matrix = new int[3][3];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = (int) (Math.random() * 10 + 1);
      }
    }
    return matrix;
  }

  public static void displayMatrix(int[][] matrix, String message) {
    System.out.println(message);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println("");
    }
  }

  public static void getDeterminant(int[][] matrix) {
    int determinant = matrix[0][0] * matrix[1][1] * matrix[2][2] + matrix[0][1] * matrix[1][2] * matrix[2][0] + 
            matrix[0][2] * matrix[1][0] * matrix[2][1] - matrix[0][2] * matrix[1][1] * matrix[2][0] - 
            matrix[0][1] * matrix[1][0] * matrix[2][2] - matrix[0][0] * matrix[1][2] * matrix[2][1];
    System.out.println("A mátrix determinánsa: " + determinant + ".");
  }

  public static void main(String[] args) {
    int[][] matrix = loadMatrix();
    displayMatrix(matrix, "3x3-as mátrix:");
    getDeterminant(matrix);
  }
}

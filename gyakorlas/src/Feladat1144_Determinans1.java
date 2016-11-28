/**
 *
 * @author mate
 */
public class Feladat1144_Determinans1 {
  public static int[][] loadMatrix() {
    int[][] matrix = new int[2][2];
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
        System.out.print(matrix[i][j] + " ");        
      }
      System.out.println("");      
    }
  }
  
  public static void getDeterminant(int[][] matrix) {
    int determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    System.out.println("A mátrix determinánsa: " + determinant + ".");
  }
  
  public static void main(String[] args) {
    int[][] matrix = loadMatrix();
    displayMatrix(matrix, "2x2-es mátrix:");
    getDeterminant(matrix);    
  }
}

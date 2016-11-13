
/**
 *
 * @author mate
 */
public class PrimeMatrix {

  static final int M = 10;
  static final int N = 10;
  static int[][] matrix = new int[M][N];

  static void loadMatrix() {
    int num;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        do {
          num = randomInt();
        } while (!(isPrime(num)) || duplicate(num));
        matrix[i][j] = num;
      }
    }
  }

  static void displayMatrix() {
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(extra.Format.right(matrix[i][j], 4));
      }
      System.out.println("");
    }
  }

  static int randomInt() {
    int num = (int) (Math.random() * 991 + 10);
    return num;
  }

  static boolean duplicate(int num) {
    for (int[] sub : matrix) {
      for (int i : sub) {
        if (i == num) {
          return true;
        }
      }
    }
    return false;
  }

  static boolean isPrime(int num) {
    int numOfDivs = 1;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        numOfDivs++;
      }
    }
    return (numOfDivs == 1);
  }

  public static void main(String[] args) {
    loadMatrix();
    displayMatrix();
  }

//  
//public class PrimeMatrix {
//  static final int M = 4;
//  static final int N = 3;
//  static int[][] matrix = new int[M][N];
//  
//  static void loadMatrix() {
//    int num; 
//    for (int i = 0; i < M; i++) {
//      for (int j = 0; j < N; j++) {
//        do {
//          num = randomInt();
//        }
//        while (!isPrime(num) || contains(num));
//        matrix[i][j] = num;
//      }
//    }
//  }
//  
//  static void displayMatrix() {
//    for (int i = 0; i < M; i++) {
//      for (int j = 0; j < N; j++) {
//        System.out.print(matrix[i][j] + "     ");
//      }
//      System.out.println("");      
//    }
//  }
//  
//  static boolean isPrime(int num) {
//    int numOfDivs = 1;
//    for (int i = 2; i <= Math.sqrt(num); i++) {
//      if (num % i == 0) {
//        numOfDivs++;
//      }
//    }
//    return (numOfDivs == 1);
//  }
//  
//  public static void main(String[] args) {
//    loadMatrix();
//    displayMatrix();
//  }
//  
//  private static int randomInt() {
//    return (int) (Math.random() * 191 + 10);
//  }
//
//  private static boolean contains(int num) {
//    for (int[] sub : matrix) {
//      for (int i : sub) {
//        if (i == num) {
//          return true;
//        }
//      }
//    }
//    return false;
//  }
//}
}


import java.util.Arrays;

/**
 *
 * @author mate
 */
public class Feladat1142_Osztok2 {

  public static int[] getDividersOfNumber(int num) {
    final int N = num / 2;
    int[] helperArray = new int[num];
    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (num % i == 0) {
        helperArray[count++] = i;
      }
    }
    helperArray[count] = num;
    int[] dividers = new int[count + 1];
    for (int i = 0; i < dividers.length; i++) {
      dividers[i] = helperArray[i];
    }
    return dividers;
  }

  public static void displayDividers(int num1, int num2) {
    int[] dividers1 = getDividersOfNumber(num1);
    int[] dividers2 = getDividersOfNumber(num2);
    int divCount1 = dividers1.length;
    int divCount2 = dividers2.length;
    int[] commonDividers = new int[Math.min(divCount1, divCount2)];
    int count = 0;
    int j;
    for (int i = 0; i < divCount1; i++) {
      j = 0;
      while (j < divCount2 && !(dividers1[i] == dividers2[j])) {
        j++;
      }
      if (j < divCount2) {
        commonDividers[count++] = dividers1[i];
      }
    }
    System.out.print("Egyik szám: " + num1 + "\nMásik szám: " + num2 + "\nA két szám közös osztói: ");
    for (int i = 0; i < count; i++) {
      System.out.print(commonDividers[i] + " ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    int num1 = (int) (Math.random() * 90 + 10);
    int num2 = (int) (Math.random() * 90 + 10);
    int[] arr = getDividersOfNumber(num1);
    int[] arr2 = getDividersOfNumber(num2);    
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
    displayDividers(num1, num2);
  }
}

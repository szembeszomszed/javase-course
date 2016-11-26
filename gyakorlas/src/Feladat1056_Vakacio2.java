/**
 *
 * @author mate
 */
public class Feladat1056_Vakacio2 {   
  public static void main(String[] args) {
     final String TEXT = "vakáció";
     int length = TEXT.length();
     for (int i = 1; i <= length; i++) {
       System.out.println(extra.Format.right(TEXT.substring(length - i), length));
    }
  }
}

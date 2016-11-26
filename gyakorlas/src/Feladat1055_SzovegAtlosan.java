/**
 * tetszőleges hosszúságú szöveg beolvasása, majd átlósan kiíratása
 * @author mate
 */
public class Feladat1055_SzovegAtlosan {
  public static void main(String[] args) {
    String text = null;    
    while ((text = extra.Console.readLine("Írjon valami szépet: ")).equals("")) {
      System.out.println("Naaa...");
    }
    int length = text.length();
    System.out.println("Jobbra: ");
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      System.out.println(text.charAt(i));           
    }
    System.out.println("Balra: ");
    for (int i = 0; i < length; i++) {
      for (int j = 1; j < length - i ; j++) {
        System.out.print("  ");        
      }
      System.out.println(text.charAt(i));      
    }
  }   
}

/**
 *
 * @author mate
 */
public class Feladat1058_Monogram {
    public static void main(String[] args) {
    String surname = null;
    String firstName = null;
    while ((surname = extra.Console.readLine("Vezetéknév: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }
    while ((firstName = extra.Console.readLine("Keresztnév: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }
    char leadingSurname = surname.charAt(0);
    char leadingFirstName = firstName.charAt(0);
    
    System.out.println("Monogram: " + Character.toUpperCase(leadingSurname) + ". " + Character.toUpperCase(leadingFirstName) + ".");
  }
}

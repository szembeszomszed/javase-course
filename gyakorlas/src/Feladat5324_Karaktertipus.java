/**
 * beolvasott karakter típusa
 * @author mate
 */
public class Feladat5324_Karaktertipus {
  public static void main(String[] args) {
    char input = extra.Console.readChar("Adjon meg egy karaktert: ");
    if (input >= '0' && input <= '9') 
      System.out.println("Ez egy számjegy!");
    else if (input >= 'a' && input <= 'z')
      System.out.println("Ez egy kisbetű!");
    else if (input >= 'A' && input <= 'Z' )
      System.out.println("Ez egy nagybetű!");
    else
      System.out.println("Ez valami más karakter!");
  }
}

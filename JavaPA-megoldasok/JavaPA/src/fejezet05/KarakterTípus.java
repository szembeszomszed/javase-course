public class KarakterTípus {
  public static void main(String[] args) {
    System.out.println("Karakter típusa");
    char c=extra.Console.readChar("Karakter: ");
    if(c>='a' && c<='z')
      System.out.println("Kisbetű.");
    else if(c>='A'&&c<='Z')
      System.out.println("Nagybetű.");
    else if(c>='0'&&c<='9')
      System.out.println("Számjegy.");
    else
      System.out.println("Egyéb karakter.");
  }
}
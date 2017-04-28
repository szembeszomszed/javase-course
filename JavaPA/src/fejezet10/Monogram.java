public class Monogram {
  public static void main(String[] args) {
    String név=extra.Console.readLine("Név: "); // nincs ellenőrzés
    char c;
    for(int i=0; i<név.length(); i++) {
      c=Character.toUpperCase(név.charAt(i));
      if(c==név.charAt(i) & c!=' ')
        System.out.print(c);
    }
    System.out.println();
  }
}
public class SzövegbenCsere {
  public static void main(String[] args) {
    System.out.println("Csere a szövegben");
    StringBuffer szöveg=new StringBuffer(extra.Console.readLine("Szöveg: "));
    char a=extra.Console.readChar("Mit cserél: ");
    char b=extra.Console.readChar("Mire cserél: ");
    //nincs ellenőrzés
    int pozíció=szöveg.toString().indexOf(a);
    while(pozíció>-1) {
      szöveg.replace(pozíció, pozíció+1, Character.toString(b));
      pozíció=szöveg.toString().indexOf(a);
    }
    System.out.println("A csere utáni szöveg: "+szöveg);
  }
}
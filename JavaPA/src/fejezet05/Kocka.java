public class Kocka {
  public static void main(String[] args) {
    System.out.println("Kocka felszíne, térfogata");
    int a=extra.Console.readInt("A kocka élének hossza: ");
    if(a>0)
      System.out.println("A kocka felszíne: "+6*a*a+
                         ", térfogata: "+a*a*a+".");
    else
      System.out.println("Hiba: a kocka élének hossza nem pozitív!");
  }
}

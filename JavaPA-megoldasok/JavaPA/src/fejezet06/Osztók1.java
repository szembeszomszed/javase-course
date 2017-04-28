public class Osztók1 {
  public static void main(String[] args) {
    System.out.println("Pozitív szám pozitív osztói");
    int szám=extra.Console.readInt("Szám: ");
    if(szám>0) {
      System.out.print("A szám pozitív osztói: ");
      for(int i=1; i<=szám; i++)
        if(szám%i==0)                                   //1
          System.out.print(i+", ");
    }
    else
      System.out.println("A szám nem pozitív!");
  }
}
public class Osztópárok {
  public static void main(String[] args) {
    System.out.println("Pozitív szám osztópárjai");
    int szám=extra.Console.readInt("Szám: ");
    if(szám>0) {
      System.out.print("A szám pozitív osztópárjai szorzatként: ");
      for(int i=1; i<=Math.sqrt(szám); i++)
        if(szám%i==0)
          System.out.print(i+"*"+(szám/i)+", ");
    }  
    else
      System.out.println("A szám nempozitív!");
  }
}
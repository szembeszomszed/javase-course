public class Osztható15tel {
  public static void main(String[] args) {
    System.out.println("Osztható-e a legalább háromjegyű szám 15-tel?");
    int x=extra.Console.readInt("Szám: ");
    if(x<100)
      System.out.println("Ez nem megfelelő!");
    else
      if((x%3==0) && (x%5==0))
        System.out.println("A szám osztható 15-tel.");
      else
        System.out.println("A szám nem osztható 15-tel.");
  }
}
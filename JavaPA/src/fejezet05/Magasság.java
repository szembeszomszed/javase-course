public class Magasság {
  public static void main(String[] args) {
    int magasság=extra.Console.readInt("Magasság (méter): ");
    if(magasság>0) {
      if(magasság<200)
        System.out.println("Alföld");
      else if(magasság<500)
        System.out.println("Dombság");
      else if(magasság<1500)
        System.out.println("Középhegység");
      else
        System.out.println("Hegység");
    }
    else
      System.out.println("A magasság nem pozitív!");
  }
}
public class Kétjegyű5telNemOszthatóSzámok {
  public static void main(String[] args) {
    System.out.println("5-tel nem osztható kétjegyű számok");
    System.out.println("----- 1. megoldás: ");
    for(int i=10; i<=99; i++)
      if(i%5!=0)
        System.out.print(i+", ");
    System.out.println();
    System.out.println("----- 2. megoldás: ");
    int j=10;
    while(j<=99) {
      if(j%5!=0)
        System.out.print(j+", ");
      j++;
    }
    System.out.println();
  }
}
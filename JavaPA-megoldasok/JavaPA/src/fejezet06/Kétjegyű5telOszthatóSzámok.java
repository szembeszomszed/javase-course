public class Kétjegyű5telOszthatóSzámok {
  public static void main(String[] args) {
    System.out.println("5-tel osztható kétjegyű számok");
    System.out.println("----- 1. megoldás: ");
    for(int i=10; i<=99; i++)
      if(i%5==0)
        System.out.print(i+", ");
    System.out.println();
    System.out.println("----- 2. megoldás: ");
    for(int i=10; i<=99; i+=5)
      System.out.print(i+", ");
    System.out.println();
    System.out.println("----- 3. megoldás: ");
    int j=10;
    while(j<=99) {
      System.out.print(j+", ");
      j+=5;
    }
    System.out.println();
    System.out.println("----- 4. megoldás: ");
    int k=10;
    do {
      System.out.print(k+", ");
      k+=5;
    } while(k<=99);
    System.out.println();
  }
}
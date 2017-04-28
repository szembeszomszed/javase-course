public class ElsőNÖsszege1 {
  public static void main(String[] args) {
    System.out.println("Első N természetes szám összege");
    int n;
    do
      n=extra.Console.readInt("N = ");
    while(n<0);
    int összeg=0;                                       //1
    for(int i=1; i<=n; i++)  {                           //2
      összeg+=i;                                        //3
      System.out.println(i + "-nél járunk: " + összeg);
    }
    System.out.println("Az első "+n+" természetes szám "+
      "összege = "+összeg);
  }
}
/*
public class ElsőNÖsszege1 {
  public static void main(String[] args) {
    System.out.println("Első N természetes szám összege");
    int n;
    do
      n=extra.Console.readInt("N = "); // ellenőrzött adatbevitel
    while(n<0);
    int összeg=0;                                       //1 // gyűjtváltozó létrehozása
    for(int i=1; i<=n; i++)                             //2
      összeg+=i;                                        //3 // puffereljük az aktuális értéket, és ehhez adjuk hozzá a következőt
    System.out.println("Az első "+n+" természetes szám "+
      "összege = "+összeg);
  }
}*/
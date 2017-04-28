public class ElsőNÖsszege1 {
  public static void main(String[] args) {
    System.out.println("Első N természetes szám összege");
    int n;
    do
      n=extra.Console.readInt("N = ");
    while(n<0);
    int összeg=0;                                       //1
    for(int i=1; i<=n; i++)                             //2
      összeg+=i;                                        //3
    System.out.println("Az első "+n+" természetes szám "+
      "összege = "+összeg);
  }
}
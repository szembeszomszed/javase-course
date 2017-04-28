public class LegközelebbiPrímszám {

  static boolean prím(int x) {
    if(x<2)
      return false;
    int osztókSzáma=1;   //mert az 1 minden számnak osztója
    for(int i=2; i<=Math.sqrt(x); i++)
      if(x%i==0)            //van osztója; x osztható i-vel
        osztókSzáma++;
    return (osztókSzáma==1);               //a szám gyökéig
  }

  static int legközelebbiPrímszám(int x) {
    if(x<2)
      return 2;
    if(prím(x))
      return x;
    int balPrím, jobbPrím, i;
    i=x-1;                                  //keresés balra
    while(!prím(i))
      i--;
    balPrím=i;
    i=x+1;                                 //keresés jobbra
    while(!prím(i))
      i++;
    jobbPrím=i;
    return (x-balPrím>jobbPrím-x)?jobbPrím:balPrím;
  }

  public static void main(String[] args) {
    System.out.println("Legközelebbi prímszám");
    int szám=extra.Console.readInt("Szám: ");
    System.out.println(legközelebbiPrímszám(szám));
  }
}
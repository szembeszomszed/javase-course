public class PrímekÉsNemPrímek {

  static boolean prím(int x) {
    if(x<2)
      return false;
    int osztókSzáma=1;   //mert az 1 minden számnak osztója
    for(int i=2; i<=Math.sqrt(x); i++)
      if(x%i==0)            //van osztója; x osztható i-vel
        osztókSzáma++;
    return (osztókSzáma==1);               //a szám gyökéig
  }
  
  public static void main(String[] args) {
    int[] tömb=new int[200];
    System.out.println("A tömb elemei");
    for(int i=0; i<200; i++)
      System.out.print((tömb[i]=(int)(Math.random()*900+100))+", ");

    System.out.println("\n\nA tömb prím elemei");
    for(int i=0; i<200; i++)
      if(prím(tömb[i]))
        System.out.print(tömb[i]+", ");

    System.out.println("\n\nA tömb nem prím elemei");
    for(int i=0; i<200; i++)
      if(!prím(tömb[i]))
        System.out.print(tömb[i]+", ");
    System.out.println();
  }
}
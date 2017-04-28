public class KétSzámKözöttiPrímek {

  static boolean prím(int x) {
    if(x<2)
      return false;
    int osztókSzáma=1;   //mert az 1 minden számnak osztója
    for(int i=2; i<=Math.sqrt(x); i++)
      if(x%i==0)            //van osztója; x osztható i-vel
        osztókSzáma++;
    return (osztókSzáma==1);               //a szám gyökéig
  }

  static void kétSzámKözöttiPrímek(int a, int b) {
    System.out.println("Prímszámok "+a+" és "+b+" között: ");
    for(int i=Math.min(a, b); i<=Math.max(a, b); i++)
      if(prím(i))
        System.out.print(i+", ");
    System.out.println();
  }

  public static void main(String[] args) {
    kétSzámKözöttiPrímek(100, 200);
  }
}
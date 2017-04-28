public class Véletlenszám {
  public static void main(String[] args) {
    System.out.println("Véletlenszám A és B között (A<=B)");
    int a=extra.Console.readInt("A = ");
    int b=extra.Console.readInt("B = ");
    if(a>b) {
      int csere=b;
      b=a;
      a=csere;
    }
    int véletlenszám=(int)(Math.random()*(b-a+1)+a);
    System.out.println("Véletlenszám "+
      a+" és "+b+" között: "+véletlenszám);
  }
}
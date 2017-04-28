public class Prímszám3 {

  static boolean prím(int x) {                          //1
    if(x<2)                                             //2
      return false;                                     //3
    int osztókSzáma=1;   //mert az 1 minden számnak osztója
    for(int i=2; i<=Math.sqrt(x); i++)     //a szám gyökéig
      if(x%i==0)            //van osztója; x osztható i-vel
        osztókSzáma++;
    return (osztókSzáma==1);  //a szám gyökéig          //4
  }

  public static void main(String[] args) {
    System.out.println("Prímszám-e?");
    int x=extra.Console.readInt("Szám: ");              //5
    System.out.println(prím(x)?"Prím.":"Nem prím.");    //6
  }
}
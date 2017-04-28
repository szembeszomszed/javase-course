public class Prímszám1 {
  public static void main(String[] args) {
    System.out.println("Prímszám-e?");
    int x=extra.Console.readInt("Szám: ");
    boolean prím;                                       //1
    if(x<2)
      prím=false;                                       //2
    else { //x>=2
      int i=2;                                          //3
      while(i<=Math.sqrt(x) && x%i!=0)                  //4
        i++;                                            //5
      prím=i>Math.sqrt(x);                              //6
    }
    System.out.println(prím?"Prím.":"Nem prím.");       //7
  }
}
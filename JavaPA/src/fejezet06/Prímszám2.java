public class Prímszám2 {
  public static void main(String[] args) {
    System.out.print("Az első ötjegyű pozitív prímszám: ");
    boolean prím=false;                                 //1
    int x=9999, i;                                      //2
    while(!prím) {                                      //3
      x++;                                              //4
      i=2;
      while(i<=Math.sqrt(x) && x%i!=0)
        i++;
      prím=i>Math.sqrt(x);
    }
    System.out.println(x);                              //5
  }
}
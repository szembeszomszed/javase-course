public class FibonacciSorozat1 {
  public static void main(String[] args) {
    System.out.println("Fibonacci-sorozat néhány tagja");
    int db=extra.Console.readInt("Tagok száma: ");
    if(db>0) {
      int a=0, b=1, c;                                  //1
      System.out.println("A Fibonacci-sorozat első "
        +db+" tagja:");
      for(int i=1; i<=db; i++) {                        //2
        c=a+b;                                          //3
        System.out.print(c+", ");
        b=a;                                            //4
        a=c;                                            //5
      }
      System.out.println();
    }
    else
      System.out.println("A tagok száma legyen pozitív!");
  }
}
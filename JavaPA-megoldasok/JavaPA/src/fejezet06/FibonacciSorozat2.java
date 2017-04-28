public class FibonacciSorozat2 {
  public static void main(String[] args) {
    System.out.println("Fibonacci-sorozat első 80 tagja");
    long a=0, b=1, c;
    for(int db=1; db<=80; db++) {
      c=a+b;
      System.out.println(db+". tag: "+c);
      b=a;
      a=c;
    }
  }
}
public class Faktoriális1 {
  public static void main(String[] args) {
    System.out.println("n! kiszámítása");
    long n;
    do
      n=extra.Console.readInt("n = ");
    while(n<0);
    long f=1;                                           //1
    for(long i=1; i<=n; i++)                            //2
      f*=i;                                             //3
    System.out.println(n+"! = "+f);
  }
}
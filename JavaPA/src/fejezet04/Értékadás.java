public class Értékadás {
  public static void main(String[] args) {
    int a, b;
    System.out.print("a="+(a=8)+ ", b="+(b=5)+"  ");    //1
    a+=b;                                               //2
    System.out.println("a+=b után:  a="+a+", b="+b);
    System.out.print("a="+(a=8)+ ", b="+(b=5)+"  ");
    a-=b;                                               //3
    System.out.println("a-=b után:  a="+a+",  b="+b);
    System.out.print("a="+(a=8)+ ", b="+(b=5)+"  ");
    a*=b;                                               //4
    System.out.println("a*=b után:  a="+a+", b="+b);
    System.out.print("a="+(a=8)+ ", b="+(b=5)+"  ");
    a/=b;                                               //5
    System.out.println("a/=b után:  a="+a+",  b="+b);
    System.out.print("a="+(a=8)+ ", b="+(b=5)+"  ");
    a%=b;                                               //6
    System.out.println("a%=b után:  a="+a+",  b="+b);
  }
}
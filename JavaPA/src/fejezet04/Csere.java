public class Csere {
  public static void main(String[] args) {
    System.out.println("Két változó értékének cseréje");
    double a=5.2, b=16.8, csere;
    System.out.println("A csere előtt:  a="+a+"  b="+b);
    csere=a;                                            //1
    a=b;                                                //2
    b=csere;                                            //3
    System.out.println("A csere után:  a="+a+"  b="+b);
  }
}
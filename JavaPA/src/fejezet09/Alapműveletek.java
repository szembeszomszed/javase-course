public class Alapműveletek {
  public static void main(String[] args) {
    System.out.println("Alapműveletek");
    System.out.println("72+135 = "+
      Alapművelet.összead(72, 135));                    //1
    System.out.println("72-135 = "+
      Alapművelet.kivon(72, 135));
    System.out.println("72*135 = "+
      Alapművelet.szoroz(72, 135));
    System.out.println("72:135 = "+                     //2
      Alapművelet.oszt(72, 135));
  }
}

final class Alapművelet {                               //3

  private Alapművelet() {                               //4
    ;                                                   //5
  }

  static int összead(int a, int b) {
    return a+b;
  }

  static int kivon(int a, int b) {
    return a-b;
  }

  static int szoroz(int a, int b) {
    return a*b;
  }

  static double oszt(int a, int b) {                    //6
    if(b==0)
      return Double.NaN;                                //7
    return (double)a/b;
  }
}
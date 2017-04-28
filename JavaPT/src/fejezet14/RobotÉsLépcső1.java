interface LépcsőAdat {
  int MINLÉPCSŐFOK=0, MAXLÉPCSŐFOK=10, FEL=+1, LE=-1;
}

class Robot implements LépcsőAdat {
  private int lépcsőfok, lépésIrány;

  public Robot() {
    lépcsőfok=MAXLÉPCSŐFOK;
    System.out.println("START: 10. lépcsőfok");
    while(lépcsőfok!=MINLÉPCSŐFOK) {
      System.out.println(lépcsőfok+". lépcsőfok.");
      lépésIrány=lépésIrány();
      lépcsőfok+=lépésIrány()*lépésSzám();
      if(lépcsőfok>MAXLÉPCSŐFOK)
        lépcsőfok=MAXLÉPCSŐFOK;
    }
    System.out.println("STOP: 0. lépcsőfok");
  }

  private int lépésIrány() {
    if(lépcsőfok==MAXLÉPCSŐFOK)
      return LE;
    if(lépcsőfok==MINLÉPCSŐFOK)
      return FEL;
    return ((int)(Math.random()*2)==0)?LE:+FEL;
  }

  private int lépésSzám() {
    int maxLépés=(int)(Math.random()*2+1); // max. 2 lépcső
    switch(lépésIrány) {
      case FEL:
        if(lépcsőfok+maxLépés>MAXLÉPCSŐFOK)
          maxLépés=MAXLÉPCSŐFOK-lépcsőfok;
      case LE:
        if(lépcsőfok-maxLépés<MINLÉPCSŐFOK)
          maxLépés=lépcsőfok;
     }
     return maxLépés;
  }
}

public class RobotÉsLépcső1 {
  public static void main(String[] args) {
    new Robot();
  }
}
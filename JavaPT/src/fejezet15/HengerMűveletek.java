package fejezet15;

class Kör {
  static double kerület(double r) {
    if(r<=0)
      return Double.NaN;
    return 2*r*Math.PI;
  }

  static double terület(double r) {
    if(r<=0)
      return Double.NaN;
    return r*r*Math.PI;
  }
}

class Téglalap {
  static double kerület(double a, double b) {
    if(a<=0 || b<=0)
      return Double.NaN;
    return 2*(a+b);
  }

  static double terület(double a, double b) {
    if(a<=0 || b<=0)
      return Double.NaN;
    return a*b;
  }
}

class Henger {
  static double felszín(double r, double m) {
    if(r<=0 || m<=0)
      return Double.NaN;
    double alapkörKerület=Kör.kerület(r);
    double alapkörTerület=Kör.terület(r);
    double palástTerület=Téglalap.terület(alapkörKerület, m);
    return 2*alapkörTerület+palástTerület;
  }

  static double térfogat(double r, double m) {
    if(r<=0 || m<=0)
      return Double.NaN;
    double alapkörTerület=Kör.terület(r);
    return alapkörTerület*m;
  }
}

public class HengerMűveletek {
  public static void main(String[] args) {
    System.out.println("Henger felszíne, térfogata");
    double sugár=                        //nincs ellenőrzés
      extra.Console.readInt("Alapkör sugara: ");
    double magasság=                     //nincs ellenőrzés
      extra.Console.readInt("Test magassága: ");

    System.out.println("Henger felszíne: "+
      Henger.felszín(sugár, magasság));   //lehet, hogy NaN
    System.out.println("Henger térfogata: "+
      Henger.térfogat(sugár, magasság));  //lehet, hogy NaN
  }
}
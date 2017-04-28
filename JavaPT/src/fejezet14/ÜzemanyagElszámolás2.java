interface GázolajElszámolásAdat {
  String TÍPUS="Gázolaj";
  int[] LÖKETTÉRFOGAT={0, 1501, 2001, 3001};          //cm3
  double[] FOGYASZTÁSINORMA=
    {5.6, 6.7, 7.6, 9.5};         //liter gázolaj 100 km-re
  int AMORTIZÁCIÓ=9;                           //Ft 1 km-re
}

public class ÜzemanyagElszámolás2
    implements GázolajElszámolásAdat {                  //1

  static int beolvas(String üzenet) {
    int x=0;
    while((x=extra.Console.readInt(üzenet+": "))<=0)
      System.out.println("Nem pozitív. Újra!");
    return x;
  }

  public static void main(String[] args) {
    System.out.println("Üzemanyag-elszámolás ("+
      TÍPUS+")");
    int táv=beolvas("Távolság [km]");
    int ár=beolvas("Üzemanyagár [Ft]");
    int lökettérfogat=beolvas("Lökettérfogat [cm3]");
    int i=1;
    while(i<LÖKETTÉRFOGAT.length && !(lökettérfogat<LÖKETTÉRFOGAT[i]))
      i++;
    double norma=FOGYASZTÁSINORMA[i-1];
    long összeg=Math.round((táv/100.0)*ár*norma+táv*AMORTIZÁCIÓ);
    System.out.println("Az üzemanyagköltség amortizációval: "+összeg+" Ft.");
  }
}
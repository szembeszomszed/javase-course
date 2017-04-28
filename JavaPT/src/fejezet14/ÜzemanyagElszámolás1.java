interface BenzinElszámolásAdat {      //public static final
  String TÍPUS="ESZ-95 ólmozatlan motorbenzin";
  int[] LÖKETTÉRFOGAT={0, 1001, 1501, 2001, 3001};    //cm3
  double[] FOGYASZTÁSINORMA=
    {7.6, 8.6, 9.5, 11.4, 13.3};   //liter benzin 100 km-re
  int AMORTIZÁCIÓ=9;                           //Ft 1 km-re
}

public class ÜzemanyagElszámolás1
    implements BenzinElszámolásAdat {                   //1

  static int beolvas(String üzenet) {
    int x=0;
    while((x=extra.Console.readInt(üzenet+": "))<=0)
      System.out.println("Nem pozitív. Újra!");
    return x;
  }

  public static void main(String[] args) {
    System.out.println("Üzemanyag-elszámolás ("+
      TÍPUS+")");                                       //2
    int táv=beolvas("Távolság [km]");
    int ár=beolvas("Üzemanyagár [Ft]");
    int lökettérfogat=beolvas("Lökettérfogat [cm3]");
    int i=1;
    while(i<LÖKETTÉRFOGAT.length &&                     //3
        !(lökettérfogat<LÖKETTÉRFOGAT[i]))              //4
      i++;
    double norma=FOGYASZTÁSINORMA[i-1];                 //5
    long összeg=
      Math.round((táv/100.0)*ár*norma+táv*AMORTIZÁCIÓ); //6
    System.out.println("Az üzemanyagköltség " +
        "amortizációval: "+összeg+" Ft.");              //7
  }
}
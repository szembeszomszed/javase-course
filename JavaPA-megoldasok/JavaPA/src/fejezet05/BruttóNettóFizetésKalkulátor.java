public class BruttóNettóFizetésKalkulátor {
  public static void main(String[] args) {
    System.out.println("Bruttó->nettó fizetés kalkulátor");
    final int HAVIMINIMÁLBÉR=71500;                    //Ft
    int haviBruttóFizetés=
      extra.Console.readInt("Havi bruttó fizetés (Ft): ");
    if(haviBruttóFizetés>=HAVIMINIMÁLBÉR) {
      int évesBruttóFizetés=haviBruttóFizetés*12;
      double évesAdó;
      if(évesBruttóFizetés<=1700000)      //18%-os adókulcs
        évesAdó=évesBruttóFizetés*0.18;
      else                                //36%-os adókulcs
        évesAdó=306000+
          (évesBruttóFizetés-1700000)*0.36;
      double haviAdóelőleg=évesAdó/12,
        egészségügyiJárulék=haviBruttóFizetés*6.0/100,
        államiNyugdíjJárulék=haviBruttóFizetés*15.0/1000,
        magánNyugdíjJárulék=haviBruttóFizetés*0.08,
        munkavállalóiJárulék=haviBruttóFizetés*0.015;
      double haviLevonandó=
        haviAdóelőleg+egészségügyiJárulék+
        államiNyugdíjJárulék+magánNyugdíjJárulék+
        munkavállalóiJárulék;
      int haviNettóFizetés=                  //legyen egész
        haviBruttóFizetés-(int)haviLevonandó;
      System.out.println("Havi nettó fizetés (Ft): "+
        haviNettóFizetés);
    }
    else
      System.out.println("A havi fizetés nem éri el a "+
        "minimálbért!");
  }
}
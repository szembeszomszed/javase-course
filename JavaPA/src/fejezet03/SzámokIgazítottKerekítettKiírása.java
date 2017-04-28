public class SzámokIgazítottKerekítettKiírása {
  public static void main(String[] args) {
    final int EGÉSZ = 12;                               //1
    System.out.println("Egész szám: "+ EGÉSZ);
    System.out.println("Egész szám igazítva:");
    System.out.println("  5 helyen balra: "+
      extra.Format.left(EGÉSZ, 5));                     //2
    System.out.println("  5 helyen jobbra: "+
      extra.Format.right(EGÉSZ, 5));                    //3
    final double VALÓS = 715.68;                        //4
    System.out.println("Valós szám: "+ VALÓS);
    System.out.println("Valós szám igazítva:");
    System.out.println("  4 tizedes balra: "+
      extra.Format.left(VALÓS, 0, 4));                  //5
    System.out.println("  1 tizedes balra: "+
      extra.Format.left(VALÓS, 0, 1));                  //6
    System.out.println("  hibás egészrész balra: "+
      extra.Format.left(VALÓS, 0, 0));                  //7
    System.out.println("  9 helyen 3 tizedes jobbra: "+
      extra.Format.right(VALÓS, 9, 3));                 //8
  }
}
public class Ciklusok {
  public static void main(String[] args) {
    System.out.println("0 végjelig számok összege");
    // KONSTANS
    final int VÉGJEL = 0;
    int szám, db = 0, összeg = 0;
    while ((szám = extra.Console.readInt((db + 1) + ".szám: ")) != VÉGJEL) {
      db++;
      összeg += szám;
    }
    if (db >= 1)
      System.out.println(db + " db szám összege: " + összeg);
    
    
//    System.out.println("Kétjegyű páros számok:");
//    for (int i = 10; i <= 99 /*&& i % 2 == 0*/; i += 2) {
//      System.out.print(i + " ");
//    }
//    System.out.println("");
//    for (int i = 10; i <= 99; i++) {
//      if (i % 2 == 0)
//        System.out.print(i + " ");
//    }
//    System.out.println("");
    
//    System.out.println("Angol ábécé nagybetűi");
//    // char esetén ''-t használunk betűnél
//    for (char betű = 'A'; betű <= 'Z'; betű++)
//      System.out.println(betű + " ");
//    System.out.println("");
}
  // main2 elnevezés csak demonstrálja, hogy level ilyen módon is több verziót készíteni
  public static void main2(String[] args) {
    System.out.println("Számok 10-től 30-ig");
    
    // inicializáló rész, egyszer fut le; belépési feltétel, lefut, lefut a ciklusmag; léptető, utána újra feltételvizsgálat)
//    for (int i = 10; i <= 30; i++) {
//      System.out.print(i + ", ");
//    }
//    System.out.println();
//    
//    for (int i = 30; i >= 10; i--) {
//      System.out.print(40-i + ", ");
//    }
//    System.out.println();

//    int szám = 10;
//    while (szám </*=*/ 30) {
//      szám++;
//      System.out.print(szám - 1/*++*/ + ", ");
//      //szám++;
//    }
//    System.out.println();
    
//    int j = 10, k = 0;
//    do {
//      System.out.print(j - k + ", ");
//      j += 2;
//      k++;
//    } while(j <= 50);
//    System.out.println();
    
  }
}

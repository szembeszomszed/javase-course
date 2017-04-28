
public class Szoveg {
  public static void main(String[] args) {
    String szoveg = "árvíztűrő tükörfúrógép";
    System.out.println("szöveg: " + szoveg);
    System.out.println("Tartalmaz-e 'ő' betűt?");
    System.out.println(szoveg.contains("ő"));
    // meg lehet nézni az indexét is - egyébként a contains is ezt teszi :)
    System.out.println(szoveg.indexOf("ő") >= 0);
    
    // rossz megoldás
//    boolean valasz = false;
//    for (int i = 0; i < szoveg.length(); i++) {
//      // ""-ben az ő-t nem hasonlította volna össze, így karaktert hasonlít a karakterhez
//      if (szoveg.charAt(i) == 'ő') {
//        valasz = true;
//        // nem szabad amúgy break-kel kiugrani ciklusból memóriaszivárgás miatt
//        break;
//      }
//    }
//    System.out.println(valasz);

// szép megoldás

    int i = 0;
    while (i < szoveg.length() && !(szoveg.charAt(i) == 'ő')) {
      i++;
    }
    boolean van = (i < szoveg.length());
    System.out.println(van);
    
    // felülírjuk az eredeti szöveget
    System.out.println(szoveg = szoveg.toUpperCase());
    System.out.println(szoveg);
    
  
  }
}

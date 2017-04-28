interface InternetesKereső {
  void keresSzöveg(String szöveg);
  void keresSzöveg(String szöveg, String hely);
  void keresKép(String szöveg);
  void keresKép(String szöveg, String hely);
}

class KeresőGoogle implements InternetesKereső {

  public void keresSzöveg(String szöveg) {
    System.out.println("A Google szöveget keres: ["+szöveg+"]");
    int találatDb=0;
    //A Google saját kereső algoritmusa
      //if(vanTalálat)
        //találatDb++;
    System.out.println("Van találat: 624 db, helyek...\n");
  }

  public void keresSzöveg(String szöveg, String hely) {
    System.out.println("A Google szöveget keres: ["+szöveg+"] csak itt: ["+hely+"]");
    //...
    System.out.println("Van találat: 12 db, helyek...\n");
  }

  public void keresKép(String szöveg) {
    System.out.println("A Google képet keres: ["+szöveg+"]");
    //...
    System.out.println("Van találat: 71 db, helyek...\n");
  }

  public void keresKép(String szöveg, String hely) {
    System.out.println("A Google képet keres: ["+szöveg+"] csak itt: ["+hely+"]");
    //...
    System.out.println("Nincs találat.\n");
  }
}

class KeresőYahoo implements InternetesKereső {

  public void keresSzöveg(String szöveg) {
    System.out.println("A Yahoo szöveget keres: ["+szöveg+"]");
    int találatDb=0;
    //A Yahoo saját kereső algoritmusa
     //if(vanTalálat)
        //találatDb++;
    System.out.println("Van találat: 584 db, helyek...\n");
  }

  public void keresSzöveg(String szöveg, String hely) {
    System.out.println("A Yahoo szöveget keres: ["+szöveg+"] csak itt: ["+hely+"]");
    //...
    System.out.println("Van találat: 17 db, helyek...\n");
  }

  public void keresKép(String szöveg) {
    System.out.println("A Yahoo képet keres: ["+szöveg+"]");
    //...
    System.out.println("Van találat: 71 db, helyek...\n");
  }

  public void keresKép(String szöveg, String hely) {
    System.out.println("A Yahoo képet keres: ["+szöveg+"] csak itt: ["+hely+"]");
    //...
    System.out.println("Nincs találat.\n");
  }
}

public class InternetesKeresők {
  public static void main(String[] args) {
    KeresőGoogle google=new KeresőGoogle();
    google.keresSzöveg("programozás Java nyelven");
    google.keresSzöveg("Java programozás", "http://www.prog.hu");
    google.keresKép("barlang");
    google.keresKép("barlang", "http://hu.wikipedia.org");
    KeresőYahoo yahoo=new KeresőYahoo();
    yahoo.keresSzöveg("programozás Java nyelven");
    yahoo.keresSzöveg("Java programozás", "http://www.prog.hu");
    yahoo.keresKép("barlang");
    yahoo.keresKép("barlang", "http://hu.wikipedia.org");
  }
}
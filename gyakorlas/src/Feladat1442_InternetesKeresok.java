
interface InternetesKereso {

  void keresSzoveg(String szoveg);

  void keresSzoveg(String szoveg, String hely);

  void keresKep(String szoveg);

  void keresKep(String szoveg, String hely);
}

class GoogleKereso {

  public void keresSzoveg(String szoveg) {
    System.out.println("A keresett szoveg: " + szoveg + ".");
    //...
    System.out.println("Google-találatok száma: 500.");
  }

  public void keresSzoveg(String szoveg, String hely) {
    System.out.println("A keresett szoveg a " + hely + " webhelyen: " + szoveg + ".");
    //...
    System.out.println("Google-találatok száma: 11.");
  }

  public void keresKep(String szoveg) {
    System.out.println("A keresett kép: " + szoveg + ".");
    //...
    System.out.println("Google-találatok száma: 6854.");
  }

  public void keresKep(String szoveg, String hely) {
    System.out.println("A keresett kép a " + hely + " webhelyen: " + szoveg + ".");
    //...
    System.out.println("Google-találatok száma: 3.");
  }
}

class YahooKereso {

  public void keresSzoveg(String szoveg) {
    System.out.println("A keresett szoveg: " + szoveg + ".");
    //...
    System.out.println("Yahoo-találatok száma: 500.");
  }

  public void keresSzoveg(String szoveg, String hely) {
    System.out.println("A keresett szoveg a " + hely + " webhelyen: " + szoveg + ".");
    //...
    System.out.println("Yahoo-találatok száma: 11.");
  }

  public void keresKep(String szoveg) {
    System.out.println("A keresett kép: " + szoveg + ".");
    //...
    System.out.println("Yahoo-találatok száma: 6854.");
  }

  public void keresKep(String szoveg, String hely) {
    System.out.println("A keresett kép a " + hely + " webhelyen: " + szoveg + ".");
    //...
    System.out.println("Yahoo-találatok száma: 3.");
  }
}  

public class Feladat1442_InternetesKeresok {
  public static void main(String[] args) {
    GoogleKereso google = new GoogleKereso();
    google.keresSzoveg("karcsi");
    google.keresSzoveg("marcsi", "www.nasa.gov");
    google.keresKep("lajcsi");
    google.keresKep("pali", "www.dk.hu");
    YahooKereso yahoo = new YahooKereso();
    yahoo.keresSzoveg("karcsi");
    yahoo.keresSzoveg("marcsi", "www.mszp.hu");
    yahoo.keresKep("lajcsi");
    yahoo.keresKep("pali", "www.pm.hu");
    
  }
}

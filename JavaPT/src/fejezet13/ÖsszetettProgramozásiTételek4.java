import java.util.*;

public class ÖsszetettProgramozásiTételek4 {

  static TreeSet<Integer> halmazFeltölt(int elemszám) {
    TreeSet<Integer> segédHalmaz=new TreeSet<Integer>();
    while(segédHalmaz.size()<elemszám)
      segédHalmaz.add((int)(Math.random()*90+10));
    return segédHalmaz;
  }

  static void halmazKiír(TreeSet<Integer> halmaz,
      String üzenet) {
    System.out.println("\n"+üzenet);
    if(halmaz.size()==0)
      System.out.println("Üres halmaz.");
    else
      System.out.println(halmaz);
  }

  static void sorozatKiír(Vector<Integer> sorozat,
      String üzenet) {
    System.out.println("\n"+üzenet);
    if(sorozat.size()==0)
      System.out.println("Üres halmaz.");
    else
      System.out.println(sorozat);
  }

  static TreeSet<Integer> metszet(
      TreeSet<Integer> halmaz1, TreeSet<Integer> halmaz2) {
    TreeSet<Integer> segédHalmaz=new TreeSet<Integer>();
    segédHalmaz.addAll(halmaz1);
    segédHalmaz.retainAll(halmaz2);
    return segédHalmaz;
  }

  static TreeSet<Integer> unió(
      TreeSet<Integer> halmaz1, TreeSet<Integer> halmaz2) {
    TreeSet<Integer> segédHalmaz=new TreeSet<Integer>();
    segédHalmaz.addAll(halmaz1);
    segédHalmaz.addAll(halmaz2);
    return segédHalmaz;
  }

  static Vector<Integer> összefuttatás(
      TreeSet<Integer> halmaz1, TreeSet<Integer> halmaz2) {
    Vector<Integer> segédSorozat=new Vector<Integer>();
    segédSorozat.addAll(halmaz1);
    segédSorozat.addAll(halmaz2);
    Collections.sort(segédSorozat);
    return segédSorozat;
  }

  public static void main(String[] args) {
    TreeSet<Integer> halmaz1=halmazFeltölt(20);
    TreeSet<Integer> halmaz2=halmazFeltölt(15);
    halmazKiír(halmaz1, "1. halmaz:");
    halmazKiír(halmaz2, "2. halmaz:");
    halmazKiír(metszet(halmaz1, halmaz2),"Metszethalmaz:");
    halmazKiír(unió(halmaz1, halmaz2), "Unióhalmaz:");
    sorozatKiír(összefuttatás(halmaz1, halmaz2),
      "Összefuttatott sorozat:");
  }
}
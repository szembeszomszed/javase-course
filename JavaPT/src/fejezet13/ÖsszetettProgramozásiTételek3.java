import java.util.Collections;
import java.util.Vector;

public class ÖsszetettProgramozásiTételek3 {

  static Vector<Integer> halmazFeltölt(int elemszám) {  //1
    Vector<Integer> segédHalmaz=new Vector<Integer>();
    while(segédHalmaz.size()<elemszám) {
      int tipp=(int)(Math.random()*90+10);
      if(!segédHalmaz.contains(tipp))
        segédHalmaz.add(tipp);
    }
    Collections.sort(segédHalmaz);
    return segédHalmaz;
  }

  static void halmazKiír(Vector<Integer> halmaz,        //2
      String üzenet) {
    System.out.println("\n"+üzenet);
    if(halmaz.size()==0)                                //3
      System.out.println("Üres halmaz.");
    else
      System.out.println(halmaz);
  }

  static Vector<Integer> metszet(
      Vector<Integer> halmaz1, Vector<Integer> halmaz2) {
    Vector<Integer> segédHalmaz=new Vector<Integer>();
    segédHalmaz.addAll(halmaz1);                        //4
    segédHalmaz.retainAll(halmaz2);                     //5
    return segédHalmaz;
  }

  static Vector<Integer> unió(
      Vector<Integer> halmaz1, Vector<Integer> halmaz2) {
    Vector<Integer> segédHalmaz=new Vector<Integer>();
    segédHalmaz.addAll(halmaz1);                        //6
    for(int halmaz2elem: halmaz2)                       //7
      if(!segédHalmaz.contains(halmaz2elem))            //8
        segédHalmaz.add(halmaz2elem);                   //9
    Collections.sort(segédHalmaz);
    return segédHalmaz;
  }

  static Vector<Integer> összefuttatás(
      Vector<Integer> halmaz1, Vector<Integer> halmaz2) {
    Vector<Integer> segédSorozat=new Vector<Integer>();
    segédSorozat.addAll(halmaz1);                      //10
    segédSorozat.addAll(halmaz2);                      //11
    Collections.sort(segédSorozat);
    return segédSorozat;
  }

  public static void main(String[] args) {
    Vector<Integer> halmaz1=halmazFeltölt(20);
    Vector<Integer> halmaz2=halmazFeltölt(15);
    halmazKiír(halmaz1, "1. halmaz:");
    halmazKiír(halmaz2, "2. halmaz:");
    halmazKiír(metszet(halmaz1, halmaz2),"Metszethalmaz:");
    halmazKiír(unió(halmaz1, halmaz2), "Unióhalmaz:");
    halmazKiír(összefuttatás(halmaz1, halmaz2),
      "Összefuttatott sorozat:");
  }
}
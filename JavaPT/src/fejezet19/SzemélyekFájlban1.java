package fejezet19SzemélyekFájlban1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

class Személy implements Comparable, Serializable {
  public String név;
  public Date születésiDátum;
  public Integer iq;

  public Személy(String név, Date születésiDátum, Integer iq) {
    this.név=new String(név);
    this.születésiDátum=születésiDátum;
    this.iq=iq;
  }

  @Override
  public String toString() {
    DateFormat dátumFormázó=DateFormat.getDateInstance(DateFormat.MEDIUM);
    return "Név: "+név+"; születési dátum: "+dátumFormázó.format(születésiDátum)+"; IQ: "+iq;
  }

  public int compareTo(Object o) {
    Date dátum1=this.születésiDátum;
    Date dátum2=((Személy)o).születésiDátum;
    return dátum1.compareTo(dátum2);
  }
}

public class SzemélyekFájlban1 {
  public static void main(String[] args) {
    File személyFájl=new File("./files/személy.dat");
    //mentés
    try {
      ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(személyFájl));
      oos.writeObject(new Személy("Kis Péter", new Date(1990-1900, 6-1, 20), 106));
      oos.writeObject(new Személy("Nagy Péter", new Date(1981-1900, 5-1, 12), 98));
      oos.writeObject(new Személy("Közepes Péter", new Date(1993-1900, 6-1, 2), 136));
      oos.writeObject(new Személy("Kis Péterné", new Date(1989-1900, 3-1, 20), 100));
      oos.writeObject(new Személy("Nagy Péterné", new Date(1972-1900, 10-1, 30), 112));
      oos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    //betöltés
    Vector<Személy> vektor=new Vector<Személy>();
    try {
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream(személyFájl));
      for(int i=1; i<=5; i++)
        vektor.add((Személy)ois.readObject());
      ois.close();
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hibás osztály!");
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    Collections.sort(vektor);
    Collections.reverse(vektor);
    System.out.println("A személyek adatai a fiatalabbaktól az idősebbek felé haladva:");
    for(Személy személy: vektor)
      System.out.println(személy);
  }
}
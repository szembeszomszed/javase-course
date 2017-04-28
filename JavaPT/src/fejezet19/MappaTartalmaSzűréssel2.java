package fejezet19MappaTartalmaSzűréssel2;

import java.io.*;

class FájlkiterjesztésSzűrő implements FilenameFilter {
  public boolean accept(File dir, String name) {
    int pontHely=name.lastIndexOf(".");
    name=name.substring(0,(pontHely>=0)?pontHely:name.length());
    return name.length()>=6;
  }
}

public class MappaTartalmaSzűréssel2 {
  public static void main(String[] args) {
    File mappa=new File("c:/windows");
    System.out.println("A "+mappa.getAbsolutePath()+" mappa szűrt tartalma (??????*.*):");
    String[] szűrtMappatartalom=mappa.list(new FájlkiterjesztésSzűrő());
    for(String bejegyzés: szűrtMappatartalom)
      System.out.print(bejegyzés+", ");
    System.out.println();
  }
}
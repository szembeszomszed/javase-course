package fejezet19MappaTartalmaSzűréssel1;

import java.io.File;
import java.io.FilenameFilter;                          //1

class FájlkiterjesztésSzűrő implements FilenameFilter { //2
  private String kiterjesztés;                          //3

  public FájlkiterjesztésSzűrő(String kiterjesztés) {   //4
    this.kiterjesztés=kiterjesztés.toUpperCase();       //5
  }

  public boolean accept(File dir, String name) {        //6
    return name.toUpperCase().
      endsWith("."+kiterjesztés);                       //7
  }
}

public class MappaTartalmaSzűréssel1 {
  public static void main(String[] args) {
    File mappa=new File("c:/windows");
    System.out.println("A "+mappa.getAbsolutePath()+
      " mappa szűrt tartalma (*.ini):");
    String[] szűrtMappatartalom=
      mappa.list(new FájlkiterjesztésSzűrő("ini"));     //8
    for(String bejegyzés: szűrtMappatartalom)
      System.out.print(bejegyzés+", ");
    System.out.println();
  }
}
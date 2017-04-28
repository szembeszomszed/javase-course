import java.io.File;

public class MappaTartalma {
  public static void main(String[] args) {
    File mappa=new File("c:/windows");                  //1
    System.out.println(
      "A "+mappa.getAbsolutePath()+" mappa tartalma:");
    String[] mappatartalom=mappa.list();                //2
    for(String bejegyzés: mappatartalom)                //3
      System.out.print(bejegyzés+", ");
    System.out.println();
  }
}

import java.io.File;
import java.io.FilenameFilter;


class FileFilter implements FilenameFilter {  
  @Override
  public boolean accept(File dir, String name) {
    return (name.indexOf(".") > 6);
  }    
}

public class Feladat1973_MappaTartalmaSzuressel2 {
  public static void main(String[] args) {
    File folder = new File("c:/windows");
    System.out.println("In " + folder + " the following filenames contain more than 6 characters: ");
    String[] filteredContent = folder.list(new FileFilter());
    for (String item : filteredContent) {
      System.out.println(item + " ");
    }
    System.out.println("");    
  }
}

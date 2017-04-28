/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Feladat1974_SzovegekMaximalisHossza {
  
  public void saveInput() {
    File textFile = new File("./files/text.txt");
    try {
      FileWriter fw = new FileWriter(textFile);
      int countLine = 0;
      String line;
      while (!(line = extra.Console.readLine("line " + ++countLine + ": ")).equals("")) {
        fw.write(line + "\r\n");
      }
      fw.close();
    } 
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  public static String getLongest() {
    String fileName = "./files/text.txt";
    String result = "";
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        if (line.length() > result.length()) {
          result = line;
        }
      }
    } catch (IOException ex) {
      System.out.println(ex);
    }
    return result;
  }
  
  /*public ArrayList<String> getContent() {
    ArrayList<String> content = new ArrayList<String>();
    File textFile = new File("./files/text.txt");
    try {
      FileReader fr = new FileReader(textFile);
      while (fr.ready()) {
        
      }
    } 
    catch (IOException e) {
      e.getMessage();
    }
  }
  public static void main(String[] args) {
   
  }
}
*/

import java.io.File;
import java.io.FileWriter;                              //1
import java.io.IOException;

public class SzövegFájl1 {
  public static void main(String[] args) {
    File szövegFájl=new File("./files/szöveg.txt");
    try {
      FileWriter fw=new FileWriter(szövegFájl);         //2
      int sorDb=0;
      String sor;
      while(!(sor=extra.Console.readLine(
           ++sorDb+". sor: ")).equals(""))              //3
        fw.write(sor+"\r\n");                           //4
      fw.close();                                       //5
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }
}
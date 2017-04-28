import java.io.File;
import java.io.FileReader;                              //1
import java.io.IOException;

public class SzövegFájl2 {
  public static void main(String[] args) {
    File szövegFájl=new File("./files/szöveg.txt");
    try {
      FileReader fr=new FileReader(szövegFájl);         //2
      System.out.println("A fájl tartalma: ");
      while(fr.ready())                                 //3
        System.out.print((char)fr.read());              //4
      fr.close();                                       //5
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }
}
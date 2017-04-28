
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Feladat1977_SokVeletlenszamFajlban3 {
  static File numFile = new File("./files/numbers3.dat");
  static int[] counter = new int[50];
  
  static void loadArray() {    
    for (int i = 0; i < counter.length; i++) {
      counter[i] = 0;      
    }
  }
  
  static void loadFile() {
    try {
      DataOutputStream output = new DataOutputStream(new FileOutputStream(numFile));
      int num;
      for (int i = 0; i < 1000; i++) {
        num = (int) (Math.random() * 50 + 1);
        output.writeInt(num);
      }
      System.out.println("Numbers have been written to file.");
    } 
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  static void processFile() {
    try {
      DataInputStream input = new DataInputStream(new FileInputStream(numFile));
      int num;
      while (true) {        
        num = input.readInt();
        counter[num-1]++;
      }
    } 
    catch (EOFException e) {
      System.out.println("Number of occurence of specific numbers: ");
      for (int i = 0; i < counter.length; i++) {
        System.out.println(i + 1 + ": " + counter[i]);        
      }
    }
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  public static void main(String[] args) {
    loadFile();
    processFile();
  }
}

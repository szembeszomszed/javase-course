
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Feladat1976_SokVeletlenszamFajlban2 {
  static File numFile = new File("./files/numbers2");
  static ArrayList<Integer> list = new ArrayList<>();
  
  static void loadFile() {
    try {
      DataOutputStream output = new DataOutputStream(new FileOutputStream(numFile));
      int num;
      for (int i = 0; i < 50; i++) {
        num = (int) (Math.random() * 1000 + 1);
        output.writeInt(num);        
      }
      output.close();
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
        list.add(num);
      }
    } 
    catch (EOFException e) {
      System.out.println("List loaded.");
    }
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  static void loadFileFromList() {
    try {
      DataOutputStream output = new DataOutputStream(new FileOutputStream(numFile));
      for (Integer num : list) {
        output.writeInt(num);
      }
      System.out.println("Numbers have been written to file.");
    } catch (IOException e) {
      e.getMessage();
    }
  }
  
  static void getList() {
    System.out.println("The numbers in descending order: ");
    try {
      DataInputStream input = new DataInputStream(new FileInputStream(numFile));
      int num;
      while (true) {        
        num = input.readInt();
        System.out.print(num + " ");
      }
    } 
    catch (EOFException e) {
      ;
    }
    catch (IOException e) {
      e.getMessage();
    }
  }  
  
  public static void main(String[] args) {
    loadFile();
    processFile();
    Collections.sort(list);
    Collections.reverse(list);
    loadFileFromList();
    getList();
  }
}

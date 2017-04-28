
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Feladat19710_SokVeletlenszamFajlban6 {
  private static List<Integer> numberList = new ArrayList<>();
  private static File numFile = new File("./files/numbers6.dat");
  
  private static void generateAndSave() {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(numFile))) {
       for (int i = 0; i < 50; i++) {
        dos.writeInt(getRandomInt());
       }
       System.out.println("Numbers have been written to file.");
    } 
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  private static int getRandomInt() {
    return (int) (Math.random() * 100 + 1);
  }
  
  private static void getDataFromFile() {
    try (DataInputStream dis = new DataInputStream(new FileInputStream(numFile))) {
      int num;
      while (true) {
        num = dis.readInt();
        numberList.add(num);
      }
    } catch (EOFException e) {
      ;
    } catch (IOException e) {
      e.getMessage();
    }
  }
  
  private static void getMedian() {
    Collections.sort(numberList);
    int median;
    int size = numberList.size();
    if (size % 2 == 0) {
      median = numberList.get(size / 2);
    } else {
      median = numberList.get((size + 1) / 2);
    }
    System.out.println("The numbers: ");
    for (Integer num : numberList) {
      System.out.print(num + " ");
    }
    System.out.println("");
    System.out.println("The median: " + median);    
  }
  
  public static void main(String[] args) {
    generateAndSave();
    getDataFromFile();
    getMedian();
  }
}

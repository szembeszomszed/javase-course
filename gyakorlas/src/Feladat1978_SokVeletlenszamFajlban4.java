
import com.sun.org.apache.bcel.internal.classfile.Code;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class NumberAndOccurence implements Comparable {
  int number;
  int occurence;
  
  public NumberAndOccurence(int number, int occurence) {
    this.number = number;
    this.occurence = occurence;
  }
  
  public String toString() {
    return number + ": " + occurence + " times.";
  }

  @Override
  public int compareTo(Object o) {
    int occurence1 = this.occurence;
    int occurence2 = ((NumberAndOccurence) o).occurence;    
    return occurence1 < occurence2 ? -1 : (occurence1 == occurence2 ? 0 : 1);
  }  
}

public class Feladat1978_SokVeletlenszamFajlban4 {

  static File numFile = new File("./files/numbers4.dat");
  //static int[] counterArray = new int[25];
  static ArrayList<Integer> counterList = new ArrayList<Integer>(100);

  static void loadFile() {
    try {
      DataOutputStream output = new DataOutputStream(new FileOutputStream(numFile));
      int num;
      for (int i = 0; i < 100; i++) {
        num = (int) (Math.random() * 25 + 1);
        output.writeInt(num);
      }
      output.close();
      System.out.println("Numbers have been written to file.");
    } catch (IOException e) {
      System.out.println("IO error: " + e.getMessage());
    }
  }

  static void processFile() {
    int num;
    DataInputStream input = null;
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    try {
      input = new DataInputStream(new FileInputStream(numFile));
      while (true) {
        num = input.readInt();
        numberList.add(num);
      }
    } 
    catch (EOFException e) {
      ;
    }
    catch (IOException e) {
      System.out.println("IO error: " + e.getMessage());
    }
    finally {
      try {
        input.close();        
      }
      catch (IOException e) {
        System.out.println("IO error: " + e.getMessage());
      }
    }
    
    Collections.sort(numberList);
    ArrayList<NumberAndOccurence> counterList = new ArrayList<NumberAndOccurence>();    
    int i = 0;
    int currentItemCount;    
    while (i < numberList.size()) {
      Integer current = numberList.get(i);
      currentItemCount = 0;
      while (i < numberList.size() && numberList.get(i).equals(current)) {
        i++;
        currentItemCount++;
      }
      counterList.add(new NumberAndOccurence(current, currentItemCount));
    }
    Collections.sort(counterList);
    System.out.println("The five most frequent numbers: ");
    for (int j = counterList.size() - 1; j >= counterList.size() - 5; j--) {
      System.out.println(counterList.get(j));      
    }    
  }
  
  public static void main(String[] args) {
    loadFile();
    processFile();
  }

}

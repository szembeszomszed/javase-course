
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

public class Feladat19711_SokVeletlenszamFajlban7 {
  static List<Integer> numberList = new ArrayList<>();
  static List<Integer> distanceList = new ArrayList<>();
  static File numberFile = new File("./files/numbers7.dat");
  
  static int createRandomInt() {
    return (int) (Math.random() * 100 + 1);
  }
  
  static void generateAndSaveNumbers() {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(numberFile))) {
      int num;
      for (int i = 0; i < 100; i++) {
        num = createRandomInt();
        dos.writeInt(num);        
      }
    } 
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  static void getNumbersFromFile() {
    try (DataInputStream dis = new DataInputStream(new FileInputStream(numberFile))) {
      int num;
      while (true) {        
        num = dis.readInt();
        numberList.add(num);
      }
    } 
    catch (EOFException e) {
      ;
    }
    catch (IOException e) {
      e.getMessage();
    }
  }
  
  static double getAverage() {
    int sum = 0;
    sum = numberList.stream().map((number) -> number).reduce(sum, Integer::sum);
    return sum / numberList.size();
  }
  
  static void getDistance() {
    int distance;
    for (Integer number : numberList) {
      distance = (int) (Math.abs(getAverage() - number));
      distanceList.add(distance);
    }
  }
  
  static void getNumbersClosestToAverage() {
    Collections.sort(distanceList);
    int currentItem = distanceList.get(0);
    int countNumbers = 1;
    int i = 1;
    while (currentItem == distanceList.get(i)) {
      countNumbers++;
      i++;
    }
    System.out.println("Number of items closest to the average (" + getAverage() + "): " + countNumbers);
  }
  
  public static void main(String[] args) {
    generateAndSaveNumbers();
    getNumbersFromFile();
    getDistance();
    getNumbersClosestToAverage();
  }
}

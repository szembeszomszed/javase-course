
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
/*
class NumberAndOccurence2 {
  private int number;
  private int occurence;

  public NumberAndOccurence2(int number, int occurence) {
    this.number = number;
    this.occurence = occurence;
  }
  
  public int sum() {
    return this.number * this.occurence;
  }

  @Override
  public String toString() {
    return number + ": " + occurence + " times.";
  }
}
*/

public class Feladat1979_SokVeletlenszamFajlban5 {
  static File numFile = new File("./files/numbers5.dat");
  static List<Integer> numbers = new ArrayList<>();
  static List<Integer> inRange = new ArrayList<>();

  static void loadFile() {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(numFile))) {
      int num;
      for (int i = 0; i < 50; i++) {
        num = (int) (Math.random() * 100 + 1);
        dos.writeInt(num);
      }
    } catch (IOException e) {
      System.out.println("IO error: " + e.getMessage());
    }
  }

  static void processFile() {
    DataInputStream dis = null;
    int num;
    try {
      dis = new DataInputStream(new FileInputStream(numFile));
      while (true) {
        num = dis.readInt();
        numbers.add(num);
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
        dis.close();
      }
      catch (IOException e) {
        System.out.println("IO error: " + e.getMessage());
      }
    }
  }
  
  public static int getSum (List<Integer> list) {
    int sum = 0;
    return list.stream().map((i) -> i).reduce(sum, Integer::sum);
  }
  
  public static double getAverage(List<Integer> list) {
    int sum = getSum(list);
    return sum / list.size();
  }
  
  public static void getInRange() {
    double avg = getAverage(numbers);
    double bottom = avg - (avg * 0.2);
    double top = avg + (avg * 0.2);
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) >= bottom && numbers.get(i) <= top) {
        inRange.add(numbers.get(i));
      }      
    }
    
    System.out.println("Number of all items: " + numbers.size());
    System.out.println("Sum of all items: " + getSum(numbers));
    System.out.println("Average of items: " + avg);
    System.out.println("Bottom: " + bottom);
    System.out.println("Top: " + top);
    System.out.println("Numbers in range: ");
    for (Integer item : inRange) {
      System.out.println(item);
    }
    System.out.println("Number of them: " + inRange.size());
    System.out.println("Average of them: " + getAverage(inRange));
    
  }
  
  public static void main(String[] args) {
    loadFile();
    processFile();
    getInRange();
  }
}

/*
package javaapplication29;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaApplication29 {

  private static final Path PATH = Paths.get("./files/numbers.txt");
  private static List<Integer> numbers;
  private static final List<Integer> inRange = new ArrayList<>();

  private static void generateAndSave() {
    try (BufferedWriter writer = Files.newBufferedWriter(PATH)) {
      for (int i = 0; i < 10_000; i++) {
        writer.write(Integer.toString(getRandInt()));
        writer.write(System.getProperty("line.separator"));
      }
    } catch (IOException ex) {
      System.out.println(ex);
    }
  }

  private static int getRandInt() {
    return (int) (Math.random() * 100 + 1);
  }

  private static void loadDataFromFile() {
    try (Stream<String> stream = Files.lines(PATH)) {
      numbers = stream.map(Integer::valueOf).collect(Collectors.toList());
    } catch (IOException ex) {
      System.out.println(ex);
    }
  }

  private static int getAverage(List<Integer> num) {
    int sum = 0;
    sum = num.stream().map((number) -> number).reduce(sum, Integer::sum);
    return sum / num.size();
  }

  private static void getInRange() {
    int average = getAverage(numbers);
    numbers.stream().filter((number) -> (number < average * 1.2 && number > average * 0.8)).forEach((number) -> inRange.add(number));
  }

  public static void main(String[] args) {
    generateAndSave();
    loadDataFromFile();
    //System.out.println(numbers);
    getInRange();
    System.out.println(inRange);
    System.out.println(inRange.size());
    System.out.println(getAverage(inRange));
  }
}

*/

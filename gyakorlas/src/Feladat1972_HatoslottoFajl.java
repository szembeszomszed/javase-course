import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.TreeSet;

public class Feladat1972_HatoslottoFajl {
  static int[] lottery() {
    TreeSet numbers = new TreeSet();
    while (numbers.size() < 6) {
      numbers.add((int) (Math.random() * 45) + 1);
    }
    Object[] objArray = numbers.toArray();
    int[] tempArray = new int[6];
    for (int i = 0; i < objArray.length; i++) {
      tempArray[i] = ((Integer) objArray[i]).intValue();      
    }
    return tempArray;
  }
  
  static void saveLottery(int[] numbers) {
    File lotteryFile = new File("./files/lottery.dat");
    try {
      FileOutputStream fos = new FileOutputStream(lotteryFile);
      for (int i = 0; i < numbers.length; i++) {
        fos.write(numbers[i]);        
      }
      fos.close();
    } 
    catch (IOException e) {
      System.out.println("I/O error: " + e.getMessage());
    }
  }
  
  static int[] loadLottery() {
    File lotteryFile = new File("./files/lottery.dat");
    int[] numbers = new int[6];
    try {
      FileInputStream fis = new FileInputStream(lotteryFile);
      int i = 0;
      int num;
      while ((num = fis.read()) != -1) {        
        numbers[i++] = num;
      }
      fis.close();
    } 
    catch (IOException e) {
      System.out.println("I/O error: " + e.getMessage());
    }
    return numbers;
  }
  
  static void getNumbers(int[] numbers) {
    System.out.println("The numbers stored in the file are the following: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");      
    }
  }
  
  public static void main(String[] args) {
    saveLottery(lottery());
    System.out.println("Numbers have been written to: files/lottery.dat");
    getNumbers(loadLottery());
  }

    
}


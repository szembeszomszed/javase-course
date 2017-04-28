/**
 * load random numbers to file by using data stream
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Feladat1975_SokVeletlenszamFajlban1 {
  static File numFile = new File("./files/numbers.dat");
  
  static void loadFile() {
    try {
      DataOutputStream output = new DataOutputStream(new FileOutputStream(numFile));
      int num;
      for (int i = 0; i < 10000; i++) {
        num = (int) (Math.random() * 1000 + 1);
        output.writeInt(num);
      }
      output.close();
    }/*
    catch (FileNotFoundException e) {
      System.out.println("Error: file not found.");
    }*/
    catch (IOException e) {
      System.out.println("Error: failed to write the file.");
    }
  }
  
  static boolean isPrime(int num) {
    int i = 2;
    while (!(num % i == 0) && i <= Math.sqrt(num)) {
      i++;
    }
    return i > Math.sqrt(num);
  }
  
  static void processFile() {
    int count = 0;
    try {
      DataInputStream input = new DataInputStream(new FileInputStream(numFile));
      int num;
      System.out.println("The primes: ");
      while (true) {
        num = input.readInt();
        if (isPrime(num)) {
          count++;
          System.out.print(num + " ");
        }
      }
    } 
    catch (EOFException e) {
      System.out.println("");
      System.out.println(count + " primes found in the file.");
    }
    catch (IOException e) {
      System.out.println("Error: failed to read the file.");
    }
  }
  
  public static void main(String[] args) {
    loadFile();
    processFile();
  }
}

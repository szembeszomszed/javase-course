/**
 * egyedi véletlenszámokból prímek kiválogatása
 * @author mate
 */
public class RandomPrimes {
  static int count;
  static int[] randomNumbers = new int[count];
  static int[] primes = new int[count];
  static int primeCount;
  
  static int[] loadRandomNumbers(int min, int max) {
    int[] tempArray = new int[count];
    int num, j;
    for (int i = 0; i < tempArray.length; i++) {
      do {
        num = (int) (Math.random() * (max - min + 1) + min);
        j = 0;
        while (j < i && !(tempArray[j] == num)) {
          j++;
        }
      } while (j < i);
      tempArray[i] = num;
    }
    return tempArray;
  }
  
  static void displayArray(String message, int[] arrayToDisplay, int max) {
    System.out.println(message);
    for (int i = 0; i < max; i++) {
      System.out.print(arrayToDisplay[i] + " ");
    }
    System.out.println("\n");
  }
  
  static boolean isPrime(int num) {
    int numOfDivs = 1;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        numOfDivs++;
      }      
    }
    return (numOfDivs == 1);
  }
  
  static int[] selectPrimes(int[] arrayToCheck) {
    int[] tempArray = new int[count];
    primeCount = 0;
    for (int i = 0; i < arrayToCheck.length; i++) {
      if (isPrime(arrayToCheck[i])) {
        tempArray[primeCount] = arrayToCheck[i];
        primeCount++;
      }
    }
    return tempArray;
  }
  
  static int[] sortArray (int[] arrayToSort, int max) {
    int tempVar;
    //int[] sortedArray = new int[max];
    for (int i = max - 1; i >= 1; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arrayToSort[j] > arrayToSort[j + 1]) {
          tempVar = arrayToSort[j];
          arrayToSort[j] = arrayToSort[j + 1];
          arrayToSort[j + 1] = tempVar;
        }        
      }      
    }
    return arrayToSort;
  }
  
  public static void main(String[] args) {
    int min, max;
    do {      
      min = extra.Console.readInt("Minimum of random numbers: ");
      if (min < 1) {
        System.out.println("Not positive. Try again!");
      }
    } while (min < 1);
    do {        
      max = extra.Console.readInt("Maximum of random numbers: ");
      if (max <= min) {
        System.out.println("Maximum value should be higher than minimum value. Try again!");
      }
    } while (max <= min);
    do {      
      count = extra.Console.readInt("Required number of randoms: ");
      if (count < 5) {
        System.out.println("You should ask for at least 5 random numbers. Try again!");
      }
    } while (count < 5);
    randomNumbers = loadRandomNumbers(min, max);
    displayArray("Random numbers: ", randomNumbers, randomNumbers.length);
    displayArray("Sorted random numbers: ", sortArray(randomNumbers, count), randomNumbers.length);
    primes = selectPrimes(randomNumbers);
    displayArray("Primes: ", primes, primeCount);
    //displayArray("A prímszámok rendezve: ", sortArray(primes, primeCount), primeCount);    
  }
}

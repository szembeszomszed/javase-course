public class NullávalOsztás4 {

  static void nullávalOsztóMetódus() {
    int a=12, b=0, c=a/b;                               //1
    System.out.println("Nem íródik ki semmi.");
  }

  public static void main(String[] args) {              //2
    nullávalOsztóMetódus();                             //3
    System.out.println("Nem íródik ki semmi.");
  }
}
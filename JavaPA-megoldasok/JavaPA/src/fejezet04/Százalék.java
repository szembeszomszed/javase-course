public class Százalék {
  public static void main(String[] args) {
    System.out.println("Százalékalap és százalékláb -> százalékérték");
    double alap = extra.Console.readDouble("alap: ");
    double láb = extra.Console.readDouble("láb: ");
    double érték = alap*láb/100;
    System.out.println("érték: "+érték);
  }
}
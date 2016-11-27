
import java.time.LocalDate;

/**
 *
 * @author mate
 */
public class Feladat10516_KisebbDatum {
  static boolean isEarlierDate(LocalDate date1, LocalDate date2) {
    return (date1.isBefore(date2));
  }
  
  public static void main(String[] args) {
    LocalDate date1 = LocalDate.of(2016, 11, 27);
    LocalDate date2 = LocalDate.of(2016, 11, 28);
    LocalDate date3 = LocalDate.of(2016, 11, 27);
    LocalDate date4 = LocalDate.of(2016, 11, 2);
    System.out.println("Az első dátum " + (isEarlierDate(date1, date2) ? "" : "nem ") + "kisebb a másodiknál.");
    System.out.println("A harmadik dátum " + (isEarlierDate(date3, date4) ? "" : "nem ") + "kisebb a negyediknél.");
  }
}

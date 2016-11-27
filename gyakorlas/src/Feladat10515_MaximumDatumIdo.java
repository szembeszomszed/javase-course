
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author mate
 */
public class Feladat10515_MaximumDatumIdo {
  public static void main(String[] args) {
    System.out.println(Long.MAX_VALUE);
    Date date = new Date(Long.MAX_VALUE);
    DateFormat formattedDate = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
    System.out.println(formattedDate.format(date));
  }
}

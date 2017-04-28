import java.util.Calendar;
import java.util.GregorianCalendar;

public class LegutóbbiSzökőév {
  public static void main(String[] args) {
    int év=(new GregorianCalendar()).get(Calendar.YEAR);
    while(!Születésnap.szökőév(év))
      év--;
    System.out.println("A legutóbbi szökőév: "+év);
    System.out.println("Abban az évben a szökőnap (február 24.) napja: "+
      Születésnap.hétNapja(év, 2, 24));
  }
}
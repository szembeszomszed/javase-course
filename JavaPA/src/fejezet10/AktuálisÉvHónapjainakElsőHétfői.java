import java.util.Calendar;
import java.util.GregorianCalendar;

public class AktuálisÉvHónapjainakElsőHétfői {
  public static void main(String[] args) {
    int év=(new GregorianCalendar()).get(Calendar.YEAR);
    int nap;
    System.out.println(év+" hónapjainak első hétfői:");
    for(int hónap=1; hónap<=12; hónap++) {
      nap=1;
      while(!Születésnap.hétNapja(év, hónap, nap).equals("hétfő"))
        nap++;
      System.out.println(" "+év+"."+hónap+"."+nap+".");
    }
  }
}
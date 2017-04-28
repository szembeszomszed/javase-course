import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

class AktuálisÉvHónapjainakElsőHétfői {
  public static void main(String[] args) {
    int év=(new GregorianCalendar()).get(Calendar.YEAR);
    int évNapDb=(new GregorianCalendar(év, 12-1, 31).get(Calendar.DAY_OF_YEAR));
    HashSet<Date> dátumHalmaz=new HashSet<Date>();
    while(dátumHalmaz.size()<10)
      dátumHalmaz.add(
        new Date(év-1900,
                (int)(Math.random()*12+1-1),
                (int)(Math.random()*28+1)));
    System.out.println(dátumHalmaz.toString());

    //évNapja=;
//    System.out.println(Calendar.getInstance().s.getInstance().get(Calendar.DAY_OF_YEAR));
//    System.out.println(év+" hónapjainak első hétfői:");
//    for(int hónap=1; hónap<=12; hónap++) {
//      nap=1;
//      while(!Születésnap.hétNapja(év, hónap, nap).equals("hétfő"))
//        nap++;
//      System.out.println(" "+év+"."+hónap+"."+nap+".");
//    }
  }
}
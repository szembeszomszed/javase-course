import java.util.Date;                                  //1

public class Dátumok1 {
  public static void main(String[] args) {
    System.out.println("Pontos dátum és idő");
    Date dátumIdő=new Date();                           //2
    System.out.println("UTC: "+dátumIdő.getTime()+"\n"+ //3
      "Alapértelmezett formátum: "+dátumIdő+"\n");      //4

    System.out.println("500000000000. ezredmásodperc");
    dátumIdő.setTime(500000000000L);                    //5
    System.out.println("UTC: "+dátumIdő.getTime()+"\n"+
      "Alapértelmezett formátum: "+dátumIdő);
  }
}
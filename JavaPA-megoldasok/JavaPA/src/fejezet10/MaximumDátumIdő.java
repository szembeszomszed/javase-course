import java.util.Date;

public class MaximumDátumIdő {
  public static void main(String[] args) {
    System.out.println("Legkésőbbi dátum és idő");
    Date dátumIdő=new Date(Long.MAX_VALUE);
    System.out.println("UTC: "+dátumIdő.getTime()+"\n"+
      "Alapértelmezett formátum: "+dátumIdő);
  }
}
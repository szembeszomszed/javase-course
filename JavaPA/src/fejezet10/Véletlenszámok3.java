import java.util.Random;                                //1

public class Véletlenszámok3 {

  public static void main(String[] args) {
    System.out.println("Véletlenszámok");
    Random véletlenSzám=new Random();                   //2
    System.out.println("Kétjegyű egész szám: "+
      (véletlenSzám.nextInt(90)+10));                   //3
    System.out.println("0 és 100 közötti szám: "+
      (véletlenSzám.nextInt(101)+1));                   //4
    System.out.println("30 és 50 közötti szám: "+
      (véletlenSzám.nextInt(50-30+1)+30));              //5
    System.out.println("Valós szám [0; 1): "+
      (véletlenSzám.nextDouble()));                     //6
    System.out.println("Logikai érték: "+
      (véletlenSzám.nextBoolean()));                    //7
  }
}
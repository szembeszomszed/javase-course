public class Véletlenszámok2 {
  public static void main(String[] args) {
    System.out.println("Véletlenszámok");
    System.out.println("kétjegyű páratlan szám: "+
      ((int)(Math.random()*45)*2+11));
    System.out.println("háromjegyű páros szám: "+
      ((int)(Math.random()*450)*2+100));
    System.out.println("hatoslottón megjátszható szám: "+
      (int)(Math.random()*45+1));    //1-től 45-ig
    System.out.println("negatív egyjegyű szám: "+
      (int)(Math.random()*9-10));    //-9-től -1-ig
    System.out.println("szabályos kockával szám: "+
      (int)(Math.random()*6+1));     //1-től 6-ig
    System.out.println("két szabályos kockával dobott számok összege: "+
      (int)(Math.random()*11+2));     //2-től 12-ig
  }
}
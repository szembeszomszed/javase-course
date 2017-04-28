public class Véletlenszámok1 {
  public static void main(String[] args) {
    System.out.println("Véletlenszámok");
    System.out.println("Math.random() függvény: "+
      Math.random()+
      "\negyjegyű szám: "+(int)(Math.random()*10)+      //1
      "\nkétjegyű szám: "+(int)(Math.random()*90+10)+   //2
      "\nháromjegyű szám: "+
        (int)(Math.random()*900+100)+                   //3
      "\nszám a [-20;+30] zárt intervallumból: "+
        (int)(Math.random()*(30-(-20)+1)+(-20))+        //4
      "\nszám a [-20;+30] zárt intervallumból: "+
        (int)(Math.random()*(51)-20)+                   //5
      "\nötöslottó egyik száma: "+
        (int)(Math.random()*90+1)+                      //6
      "\nkétjegyű páros szám: "+
        ((int)(Math.random()*45)*2+10)+                 //7
      "\nháromjegyű páratlan szám: "+
        ((int)(Math.random()*450)*2+101));              //8
  }
}
/**
 * 300 elemű tömb -50 és +50 közti véletlenszámokkal, majd a leggyakoribb szám és az ő darabszámának visszaadása
 * @author mate
 */
public class Feladat8310_LeggyakoribbSzam {
  public static void main(String[] args) {
    System.out.println("300 elemű, véletlenszámokkal megtűzdelt tömb leggyakoribb száma és az ő darabszáma.");
    int[] myArray = new int[300];
    int[] countArray = new int[101];
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = (int) (Math.random() * 101 - 50);
    }
    for (int i = 0; i < countArray.length; i++) {
      countArray[i] = 0;
    }
    for (int i = 0; i < myArray.length; i++) {
      countArray[myArray[i] + 50]++;
    }
    int max = 0, maxCount = 0;
    for (int i = 0; i < countArray.length; i++) {
      if (countArray[i] > max) {
        max = countArray[i];
        maxCount = i - 50;
      }
    }
    System.out.println("A tömb elemei: ");
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(myArray[i] + " ");
    }
    System.out.println("");
    System.out.println("A leggyakrabban előforduló elem: " + maxCount + ", a darabszáma pedig: " + max + ".");
    
//    System.out.print("300 db szám között ");
//    int[] tömb=new int[300];
//    for(int i=0; i<300; i++)
//      tömb[i]=(int)(Math.random()*101-50);
//    int leggyakoribbszámDb=0, leggyakoribbSzám=-51, db;
//    for(int i=-50; i<=50; i++) {
//      db=0;
//      for(int j=0; j<tömb.length; j++)
//        if(tömb[j]==i)
//          db++;
//      if(db>leggyakoribbszámDb) {
//        leggyakoribbszámDb=db;
//        leggyakoribbSzám=i;
//      }
//    }
//    System.out.println("a leggyakrabban előforduló szám: "+
//      leggyakoribbSzám+" ("+leggyakoribbszámDb+" db).");
  }  
}

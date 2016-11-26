package haromszog5;

public class Haromszog5Controller {

  private static
    Háromszög[] háromszögTömb = new Háromszög[50];      //1
  private static double területÖsszeg, területÁtlag;    //2

  private static void tömbFeltölt() {                   //3
    double oldal;
    for(int i=0; i<háromszögTömb.length; i++) {
      oldal=(int)(Math.random()*100+1);
      háromszögTömb[i]=new Háromszög(oldal);            //4
    }
  }

  private static void tömbLista() {                     //5
    for(int i=0; i<háromszögTömb.length; i++) {
      System.out.println((i+1)+". háromszög: "+
        háromszögTömb[i]);
    }
  }
  
  private static void legkisebbLegnagyobb() {
    double minKerület = háromszögTömb[0].kerület();
    int minHely = 0;
    double maxTerület = háromszögTömb[0].terület();
    int maxHely = 0;
    for (int i = 0; i < háromszögTömb.length; i++) {
      if (háromszögTömb[i].kerület() < minKerület) {
        minKerület = háromszögTömb[i].kerület();
        minHely = i;
      }      
      if (háromszögTömb[i].terület() > maxTerület) {
        maxTerület = háromszögTömb[i].terület();
        maxHely = i;
      }
    }
    System.out.println("A legkisebb kerületű háromszög: ");
    System.out.print(háromszögTömb[minHely]);
    System.out.println(" sorszáma: " + minHely);
    System.out.println("A legnagyobb területű háromszög: ");
    System.out.print(háromszögTömb[maxHely]);
    System.out.println(" sorszáma: " + maxHely);    
  }
    

  private static double háromszögTerületÖsszeg() {      //6
    double összeg=0;
    for(int i=0; i<háromszögTömb.length; i++)
      összeg+=háromszögTömb[i].terület();               //7
    return összeg;
  }

  public static void main(String[] args) {
    System.out.println("Műveletek háromszögekkel\n");
    tömbFeltölt();
    tömbLista();
    területÖsszeg=háromszögTerületÖsszeg();             //8
    területÁtlag=területÖsszeg/háromszögTömb.length;    //9
    System.out.println("\nA háromszögek területének "+
      "összege: "+területÖsszeg);
    System.out.println("\nA háromszögek területének "+
      "átlaga: "+területÁtlag);
    legkisebbLegnagyobb();
  }
}

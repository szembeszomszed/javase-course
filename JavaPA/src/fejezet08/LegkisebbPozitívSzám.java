public class LegkisebbPozitívSzám {
  public static void main(String[] args) {
    System.out.print("300 db szám között ");
    int[] tömb=new int[300]; //tömb
    for(int i=0; i<300; i++)
      tömb[i]=(int)(Math.random()*101-50);
    int legkisebbPozitív=51; //ennél úgyis kisebb lesz
    for(int i=0; i<300; i++)
      if(tömb[i]<legkisebbPozitív & tömb[i]>0)
        legkisebbPozitív=tömb[i];
    System.out.println(legkisebbPozitív+" a legkisebb pozitív szám.");
  }
}
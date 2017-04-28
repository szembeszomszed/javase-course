public class PárosakSzáma {
  public static void main(String[] args) {
    System.out.print("300 db szám között ");
    int párosDb=0;
    int[] tömb=new int[300]; //tömb
    for(int i=0; i<300; i++) {
      tömb[i]=(int)(Math.random()*101-50);
      if(tömb[i]%2==0)
        ++párosDb;
    }
    System.out.println(párosDb+" páros szám van.");
  }
}
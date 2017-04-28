public class HáromjegyűSzámok234SzámjegyekbőlIsmétléssel {
  public static void main(String[] args) {
    System.out.print("A 2, 3, 4 számjegyekből "+
      "képezhető háromjegyű számok (ismétléssel): ");
    for(int i=2; i<=4; i++)
      for(int j=2; j<=4; j++)
        for(int k=2; k<=4; k++)
          System.out.print(""+i+j+k+", ");
  }
}
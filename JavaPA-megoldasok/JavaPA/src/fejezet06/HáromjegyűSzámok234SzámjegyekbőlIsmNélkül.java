public class HáromjegyűSzámok234SzámjegyekbőlIsmNélkül {
  public static void main(String[] args) {
    System.out.print("A 2, 3, 4 számjegyekből "+
      "képezhető háromjegyű számok (ismétlés nélkül): ");
    for(int i=2; i<=4; i++)
      for(int j=2; j<=4; j++)
        for(int k=2; k<=4; k++)
          if(i!=j && j!=k && i!=k)                      //1
            System.out.print(""+i+j+k+", ");            //2
  }
}
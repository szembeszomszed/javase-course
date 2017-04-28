public class TökéletesSzámok {
  public static void main(String[] args) {
    System.out.print("Tökéletes számok 1-től 10000-ig: ");
    final int SZÁM=10000;
    int osztókÖsszege;
    for(int szám=2; szám<=SZÁM; szám+=2) {
      osztókÖsszege=0;
      for(int osztó=1; osztó<=szám/2; osztó++)
        if(szám%osztó==0)
          osztókÖsszege+=osztó;
      if(szám==osztókÖsszege)
        System.out.print(szám+", ");
    }
  }
}
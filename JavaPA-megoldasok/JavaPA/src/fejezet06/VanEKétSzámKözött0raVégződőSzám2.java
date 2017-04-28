public class VanEKétSzámKözött0raVégződőSzám2 {
  public static void main(String[] args) {
    System.out.println("Van-e két szám között 0-ra végződő szám?");
    int alsóHatár=extra.Console.readInt("Alsó határ: "),
      felsőHatár=extra.Console.readInt("Felső határ: ");
    if(alsóHatár<=felsőHatár) {
      int i=alsóHatár;
      while(i<=felsőHatár && !(i%10==0))
        i++;
      boolean van=i<=felsőHatár;
      System.out.print(alsóHatár+" és "+felsőHatár+" között ");
      if(van)
        System.out.println("van 0-ra végződő szám: "+i);
      else
        System.out.println("nincs 0-ra végződő szám.");
    }
    else
      System.out.println("Hibás határok!");
  }
}
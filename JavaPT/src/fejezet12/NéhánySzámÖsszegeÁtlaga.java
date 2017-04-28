public class NéhánySzámÖsszegeÁtlaga {
  public static void main (String[] args) {
    int tól=extra.Console.readInt("Alsó határ: ");
    int ig=extra.Console.readInt("Felső határ: ");
    if (tól>=ig)
      throw new IllegalArgumentException(
        "Az alsó határ nagyobb, vagy egyenlő a felső határnál.");
    int osszeg=0;
    for (int i=tól; i<=ig; i++)
      osszeg+=i;
    System.out.println(
      tól+" és "+ig+ " között a számok összege: "+osszeg+
      ", a számok átlaga: "+(double)osszeg/(ig-tól+1));
  }
}
package tengerimalacegynapja;

public class EmlosallatController {
  private static Emlosallat tengerimalac;
  public static void main(String[] args) {
    tengerimalac = new Emlosallat("tengerimalac", "Egon", 0.5);
    System.out.println(tengerimalac);
    tengerimalac.taplalkozik();
    System.out.println(tengerimalac);
    tengerimalac.szaladgal();
    System.out.println(tengerimalac);
    tengerimalac.nev = "Sátánka";
    System.out.println(tengerimalac);
    tengerimalac.taplalkozik();
    System.out.println(tengerimalac);
    tengerimalac.urit();
    System.out.println(tengerimalac);
    tengerimalac.alszik();
  }
}

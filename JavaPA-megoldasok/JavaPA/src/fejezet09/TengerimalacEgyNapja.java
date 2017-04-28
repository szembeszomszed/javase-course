public class TengerimalacEgyNapja {
  public static void main(String[] args) {
    System.out.println("Tengerimalac életének egy napja");

    System.out.println("A gazdi reggel meglátja a kisállatkereskedésben és hazaviszi");
    Emlősállat tengerimalac =
      new Emlősállat("tengerimalac", "Egon", 0.5);
    System.out.println(tengerimalac);

    System.out.println("Egon délelőtt eszik és iszik");
    tengerimalac.táplálkozik();
    System.out.println(tengerimalac);

    System.out.println("Egon megharapja a gazdit. Ezután a gazdi átnevezi Egont Sátánkára.");
    tengerimalac.név="Sátánka";
    System.out.println(tengerimalac);

    System.out.println("Sátánka szaladgál");
    tengerimalac.szaladgál();
    System.out.println(tengerimalac);

    System.out.println("Sátánka a dolgát végzi");
    tengerimalac.ürít();
    System.out.println(tengerimalac);

    System.out.println("Sátánka alszik");
    tengerimalac.alszik();
    System.out.println(tengerimalac);

    System.out.println("Egon délután eszik, eszik és eszik");
    tengerimalac.táplálkozik();
    tengerimalac.táplálkozik();
    tengerimalac.táplálkozik();
    System.out.println(tengerimalac);

    System.out.println("Sátánka alszik");
    tengerimalac.alszik();
    System.out.println(tengerimalac);
  }
}

class Emlősállat {

  private String faj;
  public String név;
  private int lábDb=4;
  private double tömeg; //kg

  public Emlősállat(String faj, String név, double tömeg) {
    this.faj=faj;
    this.név=név; //tfh. nem üres szöveg
    this.tömeg=tömeg; //tfh. pozitív és értelmes
  }

  public void táplálkozik() { //max. 5%-ot hízik
    double ötSzázalék=tömeg/20;
    tömeg+=Math.random()*(ötSzázalék+0.01);
  }

  public void ürít() {
    double ötSzázalék=tömeg*5/100; //max. 5%-ot fogy
    tömeg-=Math.random()*(ötSzázalék+0.01);
  }

  public void szaladgál() {
    double tízSzázalék=tömeg/10; //max. 10%-ot fogy
    tömeg-=Math.random()*(tízSzázalék+0.01);
  }

  public void alszik() {
    ;
  }

  public String toString() {
    return név+" nevű "+faj+", tömege: "+
      extra.Format.left(tömeg, 0, 3)+" kg";
  }
}
package jarmuvek;

public class JarmuController {
  public static void main(String[] args) {
    Jarmu jarmu = new Jarmu();
    jarmu.halad();
    Auto opelSzemelyauto = new Auto("személyautó", 4);
    opelSzemelyauto.halad();
    Auto kamion = new Auto("kamion", 12);
    kamion.halad();
    Bicikli cirkusziBicikli = new Bicikli("monocikli", 1);
    cirkusziBicikli.halad();
    Bicikli tandem = new Bicikli("tandem", 2, 2);
    tandem.halad();
    Bicikli normalBicikli = new Bicikli("bicikli", 2);
    normalBicikli.halad();
    Repulogep utasszallitoRepulo = new Repulogep("repülőgép", "sugárhajtás");
    utasszallitoRepulo.halad();
    Repulogep vitorlazoRepulo = new Repulogep("repülőgép", "szél");
    vitorlazoRepulo.halad();
    Repulogep helikopter = new Repulogep("repülőgép", "légcsavar");
    helikopter.halad();
    Hajo oceanjaro = new Hajo("hajó", "motor");
    oceanjaro.halad();
    Hajo vitorlas = new Hajo("hajó", "szél");
    vitorlas.halad();
    
  }
}

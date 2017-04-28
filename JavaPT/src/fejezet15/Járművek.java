interface Halad {
  void halad();
}

class Jármű implements Halad {
  String kategória;

  public void halad() {
    System.out.println("A jármű valahogyan halad.");
  }
}

class Autó extends Jármű {
  private int kerékDb;

  public Autó(String kategória, int kerékDb) {
    this.kategória=kategória;
    this.kerékDb=kerékDb;
  }

  @Override
  public void halad() {
    System.out.println("Az autó egy "+kategória+", "+kerékDb+" keréken gurul, motor hajtja.");
  }
}

class Bicikli extends Jármű {
  private int kerékDb, hajtóEmberDb;

  public Bicikli(String kategória, int kerékDb) {
    this.kategória=kategória;
    this.kerékDb=kerékDb;
    hajtóEmberDb=1;
  }

  public Bicikli(String kategória, int kerékDb, int hajtóEmberDb) {
    this.kategória=kategória;
    this.kerékDb=kerékDb;
    this.hajtóEmberDb=hajtóEmberDb;
  }

  @Override
  public void halad() {
    System.out.println("A bicikli egy "+kategória+", "+kerékDb+" keréken gurul, "+hajtóEmberDb+" ember hajtja.");
  }
}

class Repülőgép extends Jármű {
  String hajtóErő;

  public Repülőgép(String kategória, String hajtóErő) {
    this.kategória=kategória;
    this.hajtóErő=hajtóErő;
  }

  @Override
  public void halad() {
    System.out.println("A repülőgép egy "+kategória+", repül, "+hajtóErő+" hajtja.");
  }
}

class Hajó extends Jármű {
  String hajtóErő;

  public Hajó(String kategória, String hajtóErő) {
    this.kategória=kategória;
    this.hajtóErő=hajtóErő;
  }

  @Override
  public void halad() {
    System.out.println("A hajó egy "+kategória+", úszik, "+hajtóErő+" hajtja.");
  }
}

public class Járművek {
  public static void main(String[] args) {
    Jármű jármű=new Jármű();
    jármű.halad();
    Autó opelSzemélyautó=new Autó("személyautó", 4);
    opelSzemélyautó.halad();
    Autó kamion=new Autó("teherautó", 12);
    kamion.halad();
    Bicikli cirkusziBicikli=new Bicikli("cirkuszi bicikli", 1);
    cirkusziBicikli.halad();
    Bicikli tandem=new Bicikli("tandem bicikli", 2, 2);
    tandem.halad();
    Bicikli normálBicikli=new Bicikli("normál bicikli", 2);
    normálBicikli.halad();
    Repülőgép utasszállítóRepülő=new Repülőgép("sugárhajtású repülőgép", "motor");
    utasszállítóRepülő.halad();
    Repülőgép vitorlázóRepülő=new Repülőgép("vitorlázó repülőgép", "szél");
    vitorlázóRepülő.halad();
    Repülőgép helikopter=new Repülőgép("helikopter", "motor");
    helikopter.halad();
    Hajó óceánjáró=new Hajó("óceánjáró hajó", "motor");
    óceánjáró.halad();
    Hajó vitorlás=new Hajó("vitorlás hajó", "szél");
    vitorlás.halad();
  }
}
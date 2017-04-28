class ŐsOsztály {                                       //1
  public int publikusAdat;                              //2
  private int privátAdat;                               //3
  protected int védettAdat=3;                           //4
  int csomagszintűAdat;                                 //5

  public void publikusMetódus() {                       //6
    System.out.println("Fut a publikus metódus.");
    privátMetódus();
  }

  private void privátMetódus() {                        //7
    System.out.println("-- Fut a privát metódus.");
  }

  protected void védettMetódus() {                      //8
    System.out.println("Fut a védett metódus.");
    privátMetódus();
  }

  void csomagszintűMetódus() {                          //9
    System.out.println("Fut a csomagszintű metódus.");
    privátMetódus();
  }

  public int getPrivátAdat() {                         //10
    return privátAdat;
  }

  public void setPrivátAdat(int adat) {                //11
    privátAdat=adat;
  }
}

class UtódOsztály extends ŐsOsztály {                  //12
  void metódus() {
    publikusAdat=1;                                    //13
    System.out.println("Publikus adat: "+publikusAdat);//14
    //privátAdat=2;                                    //15
    //System.out.println("Privát adat: "+privátAdat);  //16
    setPrivátAdat(2);                                  //17
    System.out.println("Privát adat: "+
      getPrivátAdat());                                //18
    védettAdat=4;                                      //19
    System.out.println("Védett adat: "+védettAdat);    //20
    csomagszintűAdat=-3;                               //21
    System.out.println("Csomagszintű adat: "+
      csomagszintűAdat);                               //22
    publikusMetódus();                                 //23
    //privátMetódus();                                 //24
    védettMetódus();                                   //25
    csomagszintűMetódus();                             //26
  }
}

public class ÖröklődésTeszt {
  public static void main(String[] args) {
    new UtódOsztály().metódus();                       //27
  }
}
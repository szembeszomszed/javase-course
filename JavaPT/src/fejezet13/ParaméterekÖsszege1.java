public class ParaméterekÖsszege1 {
  public static void main(String[] args) {              //1
    if(args.length==0)                                  //2
      System.out.println("Nincs paraméter.");
    else {
      String hibaüzenet="";                             //3
      double összeg=0;
      int számDb=0;
      for(int i=0; i<args.length; i++) {                //4
        try {
          összeg+=Double.parseDouble(args[i]);          //5
          számDb++;
        }
        catch(NumberFormatException e) {                //6
          hibaüzenet+=args[i]+", ";
        }
      }
      System.out.println("A paraméterek száma: "+
        args.length+"\nEzek közül a számok száma: "+
        számDb+", ezek összege: "+összeg);
      if(!hibaüzenet.equals(""))                        //7
        System.out.println("A paraméterek közül " +
          "nem szám(ok): "+hibaüzenet);
    }
  }
}
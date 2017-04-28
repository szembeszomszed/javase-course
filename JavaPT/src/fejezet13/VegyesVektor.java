import java.util.Date;
import java.util.Random;
import java.util.Vector;

public class VegyesVektor {

  static boolean egészSzám(Object o) {                  //1
    return (o instanceof Byte ||
            o instanceof Short ||
            o instanceof Integer ||
            o instanceof Long);
  }

  public static void main(String[] args) {
    Vector vektor=new Vector();                         //2
    vektor.add(50);                                     //3
    vektor.add(49.75);                                  //4
    vektor.add("szöveg");                               //5
    vektor.add(new String("Ez egy mondat."));           //6
    vektor.add((byte)50);                               //7
    vektor.add(new Double(50.25));                      //8
    vektor.add(-50.0F);                                 //9
    vektor.add(new Random());                          //10
    vektor.add((int)(Math.random()*10));               //11
    vektor.add(null);                                  //12
    vektor.add(new Date());                            //13
    double összeg=0.0;
    int számDb=0, nemSzámDb=0;
    for(int i=0; i<vektor.size(); i++) {
      Object o=vektor.get(i);                          //14
      if(o instanceof Number) {                        //15
        számDb++;
        if(egészSzám(o))                               //16
          összeg+=Long.parseLong(o.toString());        //17
        else // !egészSzám(o)
          összeg+=Double.parseDouble(o.toString());    //18
      }
      else // !(o instanceof Number)
        nemSzámDb++;
    }
    System.out.println(
      "A vektorban "+számDb+" szám van, "+
      "ezek összege "+összeg+".\nA számokon kívül a "+
      "vektorban még "+nemSzámDb+" elem van.");
  }
}
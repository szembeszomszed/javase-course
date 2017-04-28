public class CsomagolóOsztálySzámok {
  public static void main(String[] args) {
    System.out.println("Egész számok műveletei");
    int egész=300;
    System.out.println("Az egész szám: "+egész);
    System.out.println(                                 //1
      "Szövegesen: "+Integer.toString(egész)+
      "\nBinárisan: "+Integer.toBinaryString(egész)+
      "\nOktálisan: "+Integer.toOctalString(egész)+
      "\nHexadecimálisan: "+Integer.toHexString(egész)+
      "\nElőjel függvénye: "+Integer.signum(egész)+
      "\nLegnagyobb 1-es bitjének helyiértéke: "+
         Integer.highestOneBit(egész));
    System.out.println("A 2526 szövegből egésszé " +
      "alakítva: "+Integer.parseInt("2526"));           //2
    System.out.println("A legkisebb egész szám:"+
      "\n byte: "+Byte.MIN_VALUE+                       //3
      "\n short: "+Short.MIN_VALUE+
      "\n int: "+Integer.MIN_VALUE+
      "\n long: "+Long.MIN_VALUE);
    System.out.println("A legnagyobb egész szám:"+
      "\n byte: "+Byte.MAX_VALUE+                       //4
      "\n short: "+Short.MAX_VALUE+
      "\n int: "+Integer.MAX_VALUE+
      "\n long: "+Long.MAX_VALUE);

    System.out.println("\nValós számok műveletei");
    double valós=6.57;
    System.out.println("A valós szám: "+valós);
    System.out.println(
      "Szöveggé alakítva: "+Double.toString(valós)+     //5
      "\nHexadecimálisan: "+Double.toHexString(valós)+
      "\nNem egy szám (NaN)? "+Double.isNaN(valós)+
      "\nVégtelen (Infinity)?: "+Double.isInfinite(valós));
    System.out.println("A legkisebb valós szám:"+
      "\n float: "+Float.MIN_VALUE+                     //6
      "\n double: "+Double.MIN_VALUE);
    System.out.println("A legnagyobb valós szám:"+
      "\n float: "+Float.MAX_VALUE+                     //7
      "\n double: "+Double.MAX_VALUE);
    System.out.println("Valós végtelenek:"+
      "\n pozitív: "+Double.POSITIVE_INFINITY+          //8
      "\n negatív: "+Double.NEGATIVE_INFINITY);
  }
}
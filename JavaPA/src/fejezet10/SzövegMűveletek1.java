public class SzövegMűveletek1 {
  public static void main(String[] args) {
    System.out.println("Műveletek szövegekkel");
    String szöveg1="alma";                              //1
    System.out.println("\nszöveg1: "+szöveg1+"\n"+
      "szöveg1 hossza: "+szöveg1.length()+"\n"+         //2
      "szöveg1 2. karaktere: "+szöveg1.charAt(2)+"\n"+  //3
      "szöveg1 üres-e? "+
        (szöveg1.isEmpty()?"igen":"nem")+"\n"+          //4
      "szöveg1 a betűre végződik-e? "+
        (szöveg1.endsWith("a")?"igen":"nem")+"\n"+      //5
      "szöveg1 fa-ra végződik-e? "+
        (szöveg1.endsWith("fa")?"igen":"nem")+"\n"+     //6
      "szöveg1-ben van-e m betű? "+
        ((szöveg1.indexOf("m")>0)?"igen":"nem")+"\n"+   //7
      "szöveg1-ben hányadik az első m betű? "+
        szöveg1.indexOf("m")+"\n"+                      //8
      "szöveg1-ben hányadik az első p betű? "+
        szöveg1.indexOf("p")+"\n"+                      //9
      "szöveg1 nagybetűsen: "+
        szöveg1.toUpperCase()+"\n"+                    //10
      "szöveg1 az 1. karakterétől kezdve: "+
        szöveg1.substring(1)+"\n"+                     //11
      "szöveg1 a 0. karakterétől a 2. karakteréig: "+
        szöveg1.substring(0, 3)+"\n"+                  //12
      "szöveg1-ben minden a kicserélve b-re: "+
        szöveg1.replace('a', 'b'));                    //13

    String szöveg2=new String("fa");                   //14
    System.out.println("\nszöveg2: "+
      szöveg2.toString());                             //15

    String szöveg3=szöveg1.concat(szöveg2);            //16
    System.out.println("\nszöveg1 és szöveg2 összefűzve "+
      "szöveg3-ban: "+szöveg3+"\n"+
      "szöveg3-ban hányadik az utolsó a betű? "+
        szöveg3.lastIndexOf("a")+"\n"+"");             //17

    String szöveg4="615.4";                            //18
    System.out.println("szöveg4: "+szöveg4+"\n"+
      "szöveg4 valós számmá alakítva: "+
        Double.parseDouble(szöveg4)+"\n");             //19

    System.out.println("szöveg1 és szöveg2 "+
      "összehasonlítva: "+szöveg1.compareTo(szöveg2)); //20
  }
}
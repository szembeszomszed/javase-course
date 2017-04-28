public class IntegerÖsszehasonlítás {
  public static void main(String[] args) {
    Integer szám1=new Integer(5);
    Integer szám2=new Integer(5);
    Integer szám3=new Integer(10);
    System.out.println("5==5? "+(szám1.equals(szám1))+  //1
      "\n5==5? "+(szám1.equals(szám2))+                 //2
      "\n5==10? "+(szám1.equals(szám3))+                //3
      "\n5==5? "+(szám1.compareTo(szám1))+              //4
      "\n5==5? "+(szám1.compareTo(szám2))+              //5
      "\n5<10? "+(szám1.compareTo(szám3))+              //6
      "\n10>5? "+(szám3.compareTo(szám1)));             //7
  }
}
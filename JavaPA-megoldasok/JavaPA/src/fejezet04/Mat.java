public class Mat {
  public static void main(String[] args) {
    System.out.println("|-3| = "+Math.abs(-3)+          //1
      "\nnégyzetgyök(16) = "+Math.sqrt(16)+             //2
      "\n\u03C0 (Pi) = "+Math.PI+                       //3
      "\nPi/4 kerekítve 3 tizedesre = "+
        extra.Format.left(Math.PI/4, 0, 3)+             //4
      "\n45° radiánban: "+Math.toRadians(45)+           //5
      "\nsin(45°) = "+Math.sin(Math.toRadians(45))+     //6
      "\nsin(Pi/4) ="+Math.sin(Math.PI/4)+              //7
      "\nnégyzetgyök(2)/2 = "+Math.sqrt(2)/2+           //8
      "\nPi radián = "+Math.toDegrees(Math.PI)+"°"+     //9
      "\n12 és 40.5 közül a nagyobb: "+
        Math.max(12, 40.5)+                            //10
      "\n1 és -4.5 közül a kisebb: "+
        Math.min(1, -4.5)+                             //11
      "\n5.6-hez legközelebbi egész: "+Math.round(5.6)+//12
      "\n5.6-hez legközelebbi egész: "+Math.rint(5.6)+ //13
      "\nkettő a nyolcadikon: "+Math.pow(2, 8)+        //14
      "\ntg(Pi/4): "+Math.tan(Math.PI/4)+              //15
      "\ntízes alapú logaritmus 1000: "+
        Math.log10(1000));                             //16
  }
}
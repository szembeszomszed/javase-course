public class Lotto {
  
  public static void main(String[] args) {
   int[] szelveny = new int[5];
   int joSzamDb = 0;
   while (joSzamDb < 5) {
     int tipp = (int) (Math.random() * 90 + 1);
     // keresés programozási tétel következik - a másik verzióban csak egysoros volt, cserébe nagyon memóriaigényes
     int i = 0;
     // megvizsgáljuk, hogy a tipp szerepel-e már a szelvényen
     // ha elértük az 5-öt, az azt jelenti, hogy nem szerepel még a tipp a szelvényen
     while (i < 5 && !(szelveny[i] == tipp))
       i++;
     boolean van = (i < 5);
     if (!van) {
       szelveny[joSzamDb] = tipp;
       joSzamDb++;
     }
   }
    // közvetlen cserés rendezés
    // minden rendezési algoritmus legalább két ciklussal megy
    // a külső ciklus az első 4 értéket veheti fel, a belső ciklus legfeljebb az utolsó 4-et (de ahogy haladunk, egyre kevesebbet)
    for (int i = 0; i < 4; i++) {
      for (int j = i + 1; j < 5; j++) {
        if (szelveny[i] > szelveny[j]) {
          int seged = szelveny[i];
          szelveny[i] = szelveny[j];
          szelveny[j] = seged;
        }        
      }      
    }
   
    for (int i = 0; i < 5; i++) 
      System.out.print(szelveny[i] + " ");
    System.out.println("");
    
}
  
  
  public static void main2(String[] args) {
    // 1-90
    boolean[] logikaiTomb = new boolean[91];
    for (int i = 1; i <= 90; i++)
      logikaiTomb[i] = false;
    
    int joSzamDb = 0;
    // 0-tól 4-ig sorszámozunk
    while (joSzamDb < 5) {      
      int tipp = (int) (Math.random() * 90 + 1);
      if (!logikaiTomb[tipp]) {
        logikaiTomb[tipp] = true;
        joSzamDb++;
      }
    }   
    
    //logikaiTomb[87] = true;
    for (int i = 1; i <= 90; i++) 
      if (logikaiTomb[i])
        System.out.print(i + " ");
    System.out.println("");
      // memory dump - a teljes adatkupacot listáztatom
      //System.out.println(i + ": " + logikaiTomb[i]);
    
  }
}

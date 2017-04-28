import java.io.*;

public class FájlMásol2 {
  public static void main(String[] args) {
    File forrásFájl=new File("./images/macska1.jpg");
    File célFájl=new File("./files/macska1.jpg");
    FileInputStream bemenet=null;
    FileOutputStream kimenet=null;
    System.out.println("A "+forrásFájl.getPath()+
      " másolása "+célFájl.getPath()+" néven:");
    try {
      bemenet=new FileInputStream(forrásFájl);
      kimenet=new FileOutputStream(célFájl);
      byte[] bájtTömb=new byte[bemenet.available()];    //1
      bemenet.read(bájtTömb);                           //2
      kimenet.write(bájtTömb);                          //3
    }
    catch(FileNotFoundException e) {
      System.out.println("Nem található: "+e.getMessage());
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    finally {
      try {
        if(bemenet!=null)
          bemenet.close();
        if(kimenet!=null)
          kimenet.close();
        System.out.println(
          "A másolás sikeresen megtörtént.");
      }
      catch(IOException e) {
        System.out.println("A másolás nem sikerült.");
      }
    }
    //célFájl.delete();
  }
}
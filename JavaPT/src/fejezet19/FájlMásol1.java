import java.io.File;
import java.io.FileInputStream;                         //1
import java.io.FileNotFoundException;                   //2
import java.io.FileOutputStream;                        //3
import java.io.IOException;                             //4

public class FájlMásol1 {
  public static void main(String[] args) {
    File forrásFájl=new File("./images/macska1.jpg");
    File célFájl=new File("./files/macska1.jpg");
    FileInputStream bemenet=null;                       //5
    FileOutputStream kimenet=null;                      //6
    System.out.println("A "+forrásFájl.getPath()+
      " másolása "+célFájl.getPath()+" néven:");
    try {                                               //7
      bemenet=new FileInputStream(forrásFájl);          //8
      kimenet=new FileOutputStream(célFájl);            //9
      int bájt;                                        //10
      while((bájt=bemenet.read())!=-1)                 //11
        kimenet.write(bájt);                           //12
    }
    catch(FileNotFoundException e) {                   //13
      System.out.println("Nem található: "+e.getMessage());
    }
    catch(IOException e) {                             //14
      System.out.println("I/O hiba: "+e.getMessage());
    }
    finally {                                          //15
      try {                                            //16
        if(bemenet!=null)                              //17
          bemenet.close();                             //18
        if(kimenet!=null)
          kimenet.close();
        System.out.println(
          "A másolás sikeresen megtörtént.");
      }
      catch(IOException e) {                           //19
        System.out.println("A másolás nem sikerült.");
      }
    }
    //célFájl.delete();                                //20
  }
}
public class EulerÁllat {
  public static void main(String[] args) {
    System.out.println("Hány darab sertést, kecskét és "+
      "juhot vásárolhatunk Euler feladata szerint?");
    for(int sertésDb=1; sertésDb<=98; sertésDb++)       //1
      for(int kecskeDb=1; kecskeDb<=98; kecskeDb++)     //2
        for(int juhDb=1; juhDb<=98; juhDb++)            //3
          if(3.5*sertésDb+4.0/3*kecskeDb+0.5*juhDb==100 &&
            sertésDb+kecskeDb+juhDb==100)               //4
            System.out.println(sertésDb+" db sertés és "+
              kecskeDb+" db kecske és "+juhDb+" db juh");
  }
}
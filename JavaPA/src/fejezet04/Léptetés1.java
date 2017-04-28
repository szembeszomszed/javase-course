public class Léptetés1 {
  public static void main(String[] args) {
    int szám=5;
    System.out.println("Szám: "+szám);                  //1
    ++szám;                                             //2
    System.out.println(
      "5 értéke prefix növelve (önállóan): "+szám);     //3
    szám=5;
    szám++;                                             //4
    System.out.println(
      "5 értéke postfix növelve (önállóan): "+szám);
    szám=5;
    System.out.println(                                 //5
      "5 értéke prefix növelve (kifejezésben): "+(++szám));
    szám=5;
    System.out.println(                                 //6
      "5 értéke postfix növelve (kifejezésben): "+szám++);
    System.out.println("Szám: "+szám);                  //7
  }
}
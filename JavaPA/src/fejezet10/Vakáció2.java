public class Vakáció2 {
  public static void main(String[] args) {
    final String VAKÁCIÓ="Vakáció";
    int hossz=VAKÁCIÓ.length();
    for(int i=1; i<=hossz; i++) {
      System.out.println(extra.Format.right(VAKÁCIÓ.substring(hossz-i), hossz));
    }    
  }
}
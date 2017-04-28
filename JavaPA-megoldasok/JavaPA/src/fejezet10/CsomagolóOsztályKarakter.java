public class CsomagolóOsztályKarakter {
  public static void main(String[] args) {
    System.out.println("Karakterek műveletei");
    char karakter='S';                                  //1
    System.out.println("A karakter: "+karakter);
    System.out.println(                                 //2
      "Nagybetűs-e? "+Character.isUpperCase(karakter)+
      "\nKisbetűs-e? "+Character.isLowerCase(karakter)+
      "\nSzámjegy-e? "+Character.isDigit(karakter)+
      "\nBetű-e? "+Character.isLetter(karakter)+
      "\nNagybetűsen: "+Character.toUpperCase(karakter)+
      "\nKisbetűsen: "+Character.toLowerCase(karakter));
  }
}
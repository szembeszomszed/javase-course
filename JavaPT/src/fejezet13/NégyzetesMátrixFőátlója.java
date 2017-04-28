public class NégyzetesMátrixFőátlója {

  static int[] mátrixFőátló(int[][] mátrix) {           //1
    int sorokSzáma=mátrix.length;
    int[] főátló=new int[sorokSzáma];
    for(int i=0; i<sorokSzáma; i++)
      főátló[i]=mátrix[i][i];
    return főátló;
  }

  public static void main(String[] args) {
    int[] főátló=mátrixFőátló(new int[][] {             //2
                   {1, 2, 3},
                   {4, 5, 6},
                   {7, 8, 9}
                 });
    System.out.print("Mátrix főátlója: ");
    for(int i=0; i<főátló.length; i++)
      System.out.print(főátló[i]+" ");
    System.out.println();
  }
}
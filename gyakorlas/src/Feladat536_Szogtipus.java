/**
 * bekért szám alapján szögtípus meghatározása
 * @author mate
 */
public class Feladat536_Szogtipus {
  public static void main(String[] args) {
     double angle = extra.Console.readInt("Adjon meg egy valós számot a szögtípus meghatározásához: ");
     if (angle >= 0 && angle <= 360) {
       if (angle == 0) {
         System.out.println("A " + angle + " fokos szög nullszög.");
       } else if (angle > 0 && angle < 90) {
         System.out.println("A(z) " + angle + " fokos szög hegyesszög.");
       } else if (angle == 90) {
         System.out.println("A " + angle + " fokos szög derékszög.");
       } else if (angle > 90 && angle < 180) {
         System.out.println("A " + angle + " fokos szög tompaszög.");
       } else if (angle == 180) {
         System.out.println("A " + angle + " fokos szög egyenesszög.");
       } else if (angle > 180 && angle < 360) {
         System.out.println("A " + angle + " fokos szög konkáv szög.");
       } else {
         System.out.println("A " + angle + " fokos szög teljes szög.");
       }
     } else {
       System.out.println("Hibás adat.");
     }
  } 
}

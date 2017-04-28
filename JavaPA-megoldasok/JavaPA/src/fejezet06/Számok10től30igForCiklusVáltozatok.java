public class Számok10től30igForCiklusVáltozatok {
  public static void main(String[] args) {
    System.out.println("1. megoldás");
    for(int i=10; i<=30; i++)
      System.out.print(i+", ");

    System.out.println("\n\n2. megoldás");
    for(int i=10; i<31; i++)
      System.out.print(i+", ");
    
    System.out.println("\n\n3. megoldás");
    for(int i=0; i<=20; ++i)
      System.out.print((i+10)+", ");
    
    System.out.println("\n\n4. megoldás");
    for(int i=1; i<=21; i++)
      System.out.print((i+9)+", ");

    System.out.println("\n\n5. megoldás");
    for(int i=0; i<=40; i+=1)
      System.out.print((i%2==0)?i/2+10:""+", ");

    System.out.println("\n\n6. megoldás");
    for(int i=0; i<=40; i++)
      if(i%2==0)
        System.out.print(i/2+10);
      else
        System.out.print(", ");
      
    System.out.println("\n\n7. megoldás");
    for(int i=30; i>=10; i--)
      System.out.print((40-i)+", ");
    
    System.out.println("\n\n8. megoldás");
    for(int i=0; i<=40; i+=2)
      System.out.print(i/2+10+", ");
    
    System.out.println("\n\n9. megoldás");
    for(int i=0; i<10; ++i)
      System.out.print((i*2+10)+", "+(i*2+11)+", ");
    System.out.print("30");
    
    System.out.println("\n\n10. megoldás");
    for(int i=40; i>19; i--)
      System.out.print((50-i)+", ");
    
    System.out.println("\n\n11. megoldás");
    for(int i=10; i<=30;)
      System.out.print(i+++", ");
    
    System.out.println("\n\n12. megoldás");
    for(int i=9; i<30;)
      System.out.print(++i+", ");
    
    System.out.println("\n\n13. megoldás");
    for(int i=10; i<=30; System.out.print(i+++", "));

    System.out.println("\n\n14. megoldás");
    for(int i=9; i<30; System.out.print(++i+", "));
    
    System.out.println("\n\n15. megoldás");
    for(int i=10; i<=30; System.out.print(i+", "), i++);
      
    System.out.println("\n\n16. megoldás");
    for(int i=10; i<=30; System.out.print(i+", "), ++i);
    
    System.out.println("\n\n17. megoldás");
    for(int i=9; i<=29; i++, System.out.print(i+", "));
      
    System.out.println("\n\n18. megoldás");
    for(int i=9; i<30; ++i, System.out.print(i+", "));

    System.out.println("\n\n19. megoldás");
    int j=10;
    for(; j<=30;)
      System.out.print((j++)+", ");
    
    System.out.println("\n\n20. megoldás");
    int k=10;
    for(; k<=30;)
      System.out.print((++k-1)+", ");
    
    System.out.println("\n\n21. megoldás");
    int l=10;
    for(; l<=30;) {
      l++;
      System.out.print((l-1)+", ");
    }

    System.out.println("\n\n22. megoldás");
    int m=10;
    for(; m<=30;) {
      ++m;
      System.out.print((m-1)+", ");
    }

    System.out.println("\n\n23. megoldás");
    int n=10;
    for(; n<=30;) {
      System.out.print(n+", ");
      n++;
    }

    System.out.println("\n\n24. megoldás");
    int o=10;
    for(; o<=30;) {
      System.out.print(o+", ");
      ++o;
    }

    System.out.println("\n\n25. megoldás");
    for(int i=-10; i>=-30; i--)
      System.out.print(-i+", ");

    System.out.println("\n\n26. megoldás");
    for(int i=-10; i>=-30; --i)
      System.out.print((-1)*i+", ");

    System.out.println("\n\n27. megoldás");
    for(int i=-10; i>=-30; i--)
      System.out.print(Math.abs(i)+", ");

    System.out.println("\n\n28. megoldás");
    for(int i=-30; i<=-10; i++)
      System.out.print(40+i+", ");

    System.out.println("\n\n29. megoldás");
    for(int i=20; i<=60; i++)
      if(i%2==0)
        System.out.print((i/2)+", ");
    
    System.out.println("\n\n30. megoldás");
    for(int i=10; i<20; i++)
      System.out.print((i*2-10)+", "+(i*2-9)+", ");
    System.out.println("30");
  }
}
import java.util.*;

interface VeremInterfész {                              //1
  public Object pop();
  public void push(Object elem);
  public boolean isEmpty();
}

class Verem implements VeremInterfész {                 //2
  private Vector verem=new Vector();                    //3

  public Object pop() {                                 //4
    if(!verem.isEmpty())
      return verem.remove(verem.size()-1);
    return null;
  }

  public void push(Object elem) {                       //5
    verem.add(elem);
  }

  public boolean isEmpty() {                            //6
    return verem.isEmpty();
  }
}

public class VeremMűveletek {
  public static void main(String[] args) {
    Verem verem = new Verem();                          //7
    verem.push("aludni");
    verem.push("görög");
    verem.push("a");
    verem.push("indul");
    while(!verem.isEmpty())                             //8
      System.out.print(verem.pop()+" ");
    System.out.println();
  }
}
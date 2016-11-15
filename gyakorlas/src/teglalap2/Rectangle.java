package teglalap2;

import java.util.Arrays;

class Rectangle {
  private double length;
  private double width;
  
  Rectangle (double l, double w) {
    if (l <= 0) {
      l = 2;
    }
    if (w <= 0) {
      w = 1;
    }
    this.length = l;
    this.width = w;
  }
  
  public double getLength () {
    return this.length;
  }
  
  public double getWidth() {
    return this.width;
  }
  
  public double perimeter() {
    return 2 * (length + width);
  }
  
  public double area() {
    return length * width;
  }

  @Override
  public String toString() {
    return "Rectangle{length = " + length + ", width = " + width + ", perimeter = " + perimeter() + ", area = " + area() + "}";
  }

  public boolean equals(Rectangle that) {
    double[] thisRectangleSides = {length, width};
    double[] thatRectangleSides = {that.getLength(), that.getWidth()};
    Arrays.sort(thisRectangleSides);
    Arrays.sort(thatRectangleSides);
    int matchingSides = 0;
    for (int i = 0; i < thisRectangleSides.length; i++) {
      if (thisRectangleSides[i] == thatRectangleSides[i]) {
        matchingSides++;
      }
    }
    return (matchingSides == 2);    
  }    
}

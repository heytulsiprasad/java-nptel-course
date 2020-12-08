class Point {
  int x, y;

  Point(int a, int b) {
    this.x = a;
    this.y = b;
  }

  public void setPoint(int a, int b) {
    this.x = a; 
    this.y = b;
  }
}

public class ConstructorNew {
  // int x, y;
  // float distance;

  public static void main(String args[]) {
    Point p = new Point(50, 102);
    p.setPoint(15, 90);

    System.out.println(" x = " + p.x);
    // System.out.println(" y = " + p.y);
  }
}
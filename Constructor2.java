import java.lang.Math;

class Circle {
  double x, y, r;

  double circumference() {
    return 2*3.14159*r;
  }

  double area() {
    return (22/7)*(Math.pow(r, 2));
  }

  Circle (double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  Circle (double a) {
    // here this refers to first constructor
    // x = 0; y = 0; r = a;
    this(0, 0, a);
  }

  // Duplicates objects
  Circle (Circle circle) {
    this(circle.x, circle.y, circle.r);
  }

  // Default constructor
  Circle() {
    this(0, 0, 1);
  }
}

class Constructor2 {
  public static void main(String args[]) {
    Circle c1 = new Circle(4, 5, 6);
    Circle c2 = new Circle(46);
    Circle c3 = new Circle();
    Circle c4 = new Circle(c3);

    // System.out.println(c);
    System.out.println("Circumference " + c1.circumference());
    System.out.println("Area " + c1.area());
    System.out.println("Circumference " + c2.circumference());
    System.out.println("Area " + c2.area());
    System.out.println("Circumference " + c3.circumference());
    System.out.println("Area " + c3.area());
    System.out.println("Circumference " + c4.circumference());
    System.out.println("Area " + c4.area());
  }
}
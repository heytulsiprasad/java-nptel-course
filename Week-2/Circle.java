public class Circle {
  int counter = 0;
  double x, y, r;

  public Circle(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public Circle(double r) {
    this(0, 0, r);
    counter++;
  }

  public Circle(Circle c) {
    this(c.x, c.y, c.r);
    counter++;
  }

  public Circle() {
    this(0, 0, 0.1);
    counter++;
  }

  public double circumference() {
    return (2*3.14*r);
  }

  public static double area() {
    return (3.14*r*r);
  }

  public static void main(String args[]) {
    Circle c1 = new Circle();
    System.out.println("c1: " + area());

    // Circle c2 = new Circle(5.0);
    // System.out.println("c2: " + c2.counter);

    // Circle c3 = new Circle(c2);
    // System.out.println("c3: " + c3.counter);
  }
}

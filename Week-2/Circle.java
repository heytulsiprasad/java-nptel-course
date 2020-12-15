public class Circle {
  static int counter = 0; // significance of static?
  double x, y, r; // significance of public?

  Circle(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  Circle(double r) {
    this(0, 0, r);
    counter++;
  }

  Circle(Circle c) {
    this(c.x, c.y, c.r);
    counter++;
  }

  Circle() {
    this(0, 0, 0.1);
    counter++;
  }

  public double circumference() {
    return (2*3.14*r);
  }

  public double area() {
    return (3.14*r*r);
  }

  public static void main(String args[]) {
    Circle c1 = new Circle(5, 6, 7);
    System.out.println("c1: " + c1.counter);
    System.out.println(c1.area() + " " +  c1.circumference());

    // Circle c2 = new Circle(5.0);
    // System.out.println("c2: " + c2.counter);

    // Circle c3 = new Circle(c2);
    // System.out.println("c3: " + c3.counter);

    // System.out.println(Circle.counter);
  }
}

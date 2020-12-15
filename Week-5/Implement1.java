import myInterface.firstInterface;

public class Implement1 implements firstInterface {
  public void display() {
    System.out.println("Fine! " + a);
  }

  public static void main (String[] args) {
    Implement1 t = new Implement1();
    t.display();
    System.out.println("The final value of a in myInterface is " + a);
  }
}

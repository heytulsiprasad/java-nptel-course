package Oops.exceptionHandling;

public class HowToThrow {
  public static void main(String[] args) {
    foo();
  }

  static void foo() {
    int a = 5;
    int b = 4;

    int c = a / b;

    System.out.println(c);
    
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("After delay");

    // try {
    //   bar();
    // } catch (Exception e) {
    //   System.out.println(e.getMessage() + ", occured");
    // }
  }

  static void bar() throws ArrayIndexOutOfBoundsException {
    boolean isDanger = true;

    if (isDanger) {
      throw new ArrayIndexOutOfBoundsException("Danger was incoming");
    }
  }
}

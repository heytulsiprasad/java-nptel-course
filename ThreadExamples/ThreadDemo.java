package ThreadExamples;

class Hi extends Thread {
  public void run() {
    for (int i=1; i<=5; i++) {
      System.out.println("Hi");
      try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
    }
  }
}

class Hello extends Thread {
    public void run() {
    for (int i=1; i<=5; i++) {
      System.out.println("Hello");
      try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
    }
  }
}

public class ThreadDemo {
  public static void main(String[] args) {
    Hi h1 = new Hi();
    Hello h2 = new Hello();

    h1.start();
    h2.start();

    // h1.show();
    // h2.show();
  }
}

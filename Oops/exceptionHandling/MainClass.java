package Oops.exceptionHandling;

public class MainClass {
  public static void main(String[] args) {
    try {
      //  int a = 0;
      //  int b = 5;

      //  int c = b / a;

      int a [] = new int[5];

      System.out.println(a[6]);

      //  System.out.println(c);
    } catch(ArithmeticException e) {
      System.out.println(e.getMessage() + ", occured let's debug!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Okay");
  }
}

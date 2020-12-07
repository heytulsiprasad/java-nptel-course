import java.util.Scanner;

public class Scanner1 {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first no=");

    int n1, n2;
    n1 = s.nextInt();

    System.out.println("Enter second no=");

    n2 = s.nextInt();
    System.out.println("Sum of no.is=" + (n1 + n2));

    System.exit(0);
  }
}
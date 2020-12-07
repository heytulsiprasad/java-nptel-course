import java.io.DataInputStream;

// Take PRT as input and show simple interest
public class DataInputStream1  {
  public static void main(String args[]) throws Exception {
    Float pAmt = new Float(0);
    Float roi = new Float(0); 

    int years = 0;

    // try {
      DataInputStream data = new DataInputStream(System.in);

      String temp;

      System.out.print("Enter Principal Amount: ");
      System.out.flush();
      temp = data.readLine();
      pAmt = Float.valueOf(temp);

      System.out.print("Enter ROI: ");
      System.out.flush();
      temp = data.readLine();
      roi = Float.valueOf(temp);

      System.out.print("Enter number of years: ");
      System.out.flush();
      temp = data.readLine();
      years = Integer.parseInt(temp);

      float tInt = pAmt * roi * years;
      // System.out.printf("Total Interest = %d", tInt);
      System.out.println("Total Interest = " + tInt);
    // } 
    // catch (Exception e) {
      //TODO: handle exception
    // }
  }
}

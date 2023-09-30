import java.util.Scanner;

public class ElectricityBill {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int units;
      double billAmount = 0;

      System.out.print("Enter the number of units consumed: ");
      units = sc.nextInt();

      if(units <= 50) {
         billAmount = units * 0.50;
      } else if(units <= 150) {
         billAmount = 25 + ((units - 50) * 0.75);
      } else if(units <= 250) {
         billAmount = 100 + ((units - 150) * 1.20);
      } else {
         billAmount = 220 + ((units - 250) * 1.50);
      }

      System.out.println("Your electricity bill amount is: " + billAmount);
      sc.close();
   }
}

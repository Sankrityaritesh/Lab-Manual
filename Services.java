import java.util.Scanner;

public class Services {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int num1, num2;
          int choice;
          double result = 0;

          System.out.print("Enter the first number: ");
          num1 = sc.nextInt();

          System.out.print("Enter the second number: ");
          num2 = sc.nextInt();

          System.out.println("Select the operation to perform:");
          System.out.println("1. Addition");
          System.out.println("2. Subtraction");
          System.out.println("3. Multiplication");
          System.out.println("4. Division");
          System.out.print("Enter your choice: ");
          choice = sc.nextInt();

          switch(choice) {
             case 1:
                result = num1 + num2;
                break;
             case 2:
                result = num1 - num2;
                break;
             case 3:
                result = num1 * num2;
                break;
             case 4:
                if(num2 == 0) {
                   System.out.println("Cannot divide by zero!");
                   return;
                }
                result = (double)num1 / num2;
                break;
             default:
                System.out.println("Invalid choice!");
                return;
          }

          System.out.println("Result: " + result);
    }
   }
}
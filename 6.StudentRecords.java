import java.util.Scanner;

public class StudentRecords {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name;
      int rollNo, marks;

      System.out.print("Enter number of students: ");
      int n = sc.nextInt();

      for(int i=0; i<n; i++) {
         System.out.print("Enter name of student "+(i+1)+": ");
         name = sc.next();
         System.out.print("Enter roll number of student "+(i+1)+": ");
         rollNo = sc.nextInt();
         System.out.print("Enter marks of student "+(i+1)+": ");
         marks = sc.nextInt();

         System.out.println("Name: "+name+", Roll No: "+rollNo+", Marks: "+marks);
         sc.close();
      }
   }
}

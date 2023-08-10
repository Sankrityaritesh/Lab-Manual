import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateArraySort {
    public static void main(String[] args) {
        // Step 1: Create an array of Date objects
        Date[] datesArray = new Date[5];

        // Step 2: Populate the array with dates (Example dates here)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            datesArray[0] = sdf.parse("02/08/2023");
            datesArray[1] = sdf.parse("15/06/2023");
            datesArray[2] = sdf.parse("25/12/2022");
            datesArray[3] = sdf.parse("10/03/2023");
            datesArray[4] = sdf.parse("31/01/2023");
        } catch (ParseException e) {
            System.out.println("Error parsing dates.");
            return;
        }

        // Step 3: Sort the array in ascending order
        Arrays.sort(datesArray);

        // Display the sorted array
        System.out.println("Sorted Dates:");
        for (Date date : datesArray) {
            System.out.println(sdf.format(date));
        }
    }
}

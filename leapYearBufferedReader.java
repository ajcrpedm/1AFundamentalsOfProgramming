import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class leapYearBufferedReader{
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Please enter a year: ");
            String yearInput = dataIn.readLine();
            int year = Integer.parseInt(yearInput);
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
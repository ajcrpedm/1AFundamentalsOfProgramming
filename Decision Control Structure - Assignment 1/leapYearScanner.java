import java.util.Scanner;
public class leapYearScanner {
    public static void main(String[] args) {
        String yearInput;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        yearInput = scanner.nextLine();
        year = Integer.parseInt(yearInput.trim());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
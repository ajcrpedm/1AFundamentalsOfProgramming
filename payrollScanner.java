import java.util.Scanner;
public class payrollScanner {
    public static void main(String[] args) {
        String hourlyPayInput;
        double rate;
        String hoursInput;
        double hours;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hourly pay rate:  ");
        hourlyPayInput = scanner.nextLine();
        rate = Double.parseDouble(hourlyPayInput);
        System.out.print("Enter hours worked: ");
        hoursInput = scanner.nextLine();
        hours = Double.parseDouble(hoursInput);
        double gross = rate * hours;
        double taxPercent;
        if (gross <= 2000) {
            taxPercent = 10;
        } else if (gross <= 4000) {
            taxPercent = 12;
        } else if (gross <= 10000) {
            taxPercent = 15;
        } else {
            taxPercent = 20;
        }
        double tax = gross * taxPercent / 100;
        double net = gross - tax;
        System.out.printf("Gross Pay: Php %.2f%n", gross);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", taxPercent, tax);
        System.out.printf("Net Pay: Php %.2f%n", net);

    }
}
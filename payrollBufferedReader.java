import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class payrollBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter hourly pay rate: ");
            String rateInput = dataIn.readLine();
            double rate = Double.parseDouble(rateInput);
            System.out.print("Enter hours worked: ");
            String hoursInput = dataIn.readLine();
            double hours = Double.parseDouble(hoursInput);
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
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
import javax.swing.JOptionPane;
public class payrollJOption {
    public static void main(String[] args){
        String hourlypayInput = "";
        hourlypayInput = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double rate = Double.parseDouble(hourlypayInput);
        String hoursInput = "";
        hoursInput = JOptionPane.showInputDialog("Enter hours worked: ");
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
        String output = String.format("Gross Pay: Php %.2f%n" +
                        "Withholding Tax (%.0f%%): Php %.2f%n" +
                        "Net Pay: Php %.2f%n", gross, taxPercent, tax, net);
        JOptionPane.showMessageDialog(null, output);
    }
}
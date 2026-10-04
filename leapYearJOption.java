import javax.swing.JOptionPane;
public class leapYearJOption {
    public static void main(String[] args){
        String yearInput = "";
        yearInput = JOptionPane.showInputDialog("Please enter a year: ");
        int year = Integer.parseInt(yearInput);

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            String output = year + " is a leap year.";
            JOptionPane.showMessageDialog(null,output);
        } else {
            String output = year + " is not a leap year.";
            JOptionPane.showMessageDialog(null,output);
        }
    }
}

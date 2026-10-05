package DCS_Ass3;
import javax.swing.JOptionPane;
public class scholarshipJOption {
    public static void main(String[] args) {
        String nsatScoreInput = JOptionPane.showInputDialog("Enter your NSAT score: ");
        double nsatScore = Double.parseDouble(nsatScoreInput);
        String salaryInput = JOptionPane.showInputDialog("Enter your parents' salary: ");
        double salary = Double.parseDouble(salaryInput);
        String examScoreInput = JOptionPane.showInputDialog("Enter your entrance exam score: ");
        double examScore = Double.parseDouble(examScoreInput);
        double nsatExamMean = (nsatScore + examScore) / 2;

        if (salary > 10000|| nsatScore < 90 || examScore < 85){
            String output = "Sorry!\nApplication Status: Rejected";
            JOptionPane.showMessageDialog(null, output);
        } else if (salary <= 3500 && nsatExamMean >= 91) {
            String output = "Congratulations!\nScholarship Status: Accepted";
            JOptionPane.showMessageDialog(null, output);
        } else {
            String output = "Please wait for your result!\nApplication status: Subjected for further study";
            JOptionPane.showMessageDialog(null, output);
        }
    }
}

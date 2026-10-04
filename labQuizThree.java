import javax.swing.JOptionPane;
public class labQuizThree {
    public static void main(String[] args){
        String salaryInput = "";
        salaryInput = JOptionPane.showInputDialog("Please input your salary: ");
        double salary = Double.parseDouble(salaryInput);

        // Compute new salary
        double newSalary = (salary + (salary * 0.1775));
        double retroactivePay = (salary * 0.1775);

        String output = "Good day Employee No. XXXXX!\n" +
                "Your retroactive pay is P" + (retroactivePay * 2) + " for 2 months" + "\n" +
                "Your new salary is P" + newSalary;
        JOptionPane.showMessageDialog(null,output);
    }
}

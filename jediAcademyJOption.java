package DCS_Ass4;
import javax.swing.JOptionPane;
public class jediAcademyJOption {
    public static void main (String[] args){
        String heightInput = JOptionPane.showInputDialog("Enter your height in cm: ");
        int height = Integer.parseInt(heightInput);
        String ageInput = JOptionPane.showInputDialog("Enter your age: ");
        int age = Integer.parseInt(ageInput);
        String citizenshipCodeInput = JOptionPane.showInputDialog("What is your citizenship code?\n(C - Citizen of Endor, N - Non-Citizen) ");
        char citizenshipCode = citizenshipCodeInput.charAt(0);
        String recommendeeCodeInput = JOptionPane.showInputDialog("Are you recommended by Jedi Master Obi Wan?\n(R - Recommendee, N - Non-recommendee) ");
        char recommendeeCode = recommendeeCodeInput.charAt(0);

        if (recommendeeCode == 'R'){
            String output = "Congratulations! Welcome to the Jedi Knight Military Academy!\nApplication Status: Accepted";
            JOptionPane.showMessageDialog(null, output);
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenshipCode == 'C') {
            String output = "Congratulations! Welcome to the Jedi Knight Military Academy!\nApplication Status: Accepted";
            JOptionPane.showMessageDialog(null, output);
        } else {
            String output = "Please wait for your result!\nApplication status: Subjected for further study";
            JOptionPane.showMessageDialog(null, output);
        }
    }
}

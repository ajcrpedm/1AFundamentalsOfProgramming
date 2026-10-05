package DCS_Ass4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class jediAcademyBufferedReader {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your height in cm: ");
            String heightInput = dataIn.readLine();
            int height = Integer.parseInt(heightInput);
            System.out.print("Enter age: ");
            String ageInput = dataIn.readLine();
            int age = Integer.parseInt(ageInput);
            System.out.print("What is your citizenship code? (C - Citizen of Endor, N - Non-Citizen) ");
            char citizenshipCode = dataIn.readLine().charAt(0);
            System.out.print("Are you recommended by Jedi Master Obi Wan? (R - Recommendee, N - Non-recommendee) ");
            char recommendeeCode = dataIn.readLine().charAt(0);

            if (recommendeeCode == 'R'){
                System.out.print("Congratulations!\n" +
                        "Welcome to the Jedi Knight Military Academy!\n" +
                        "Application Status: Accepted");
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenshipCode == 'C') {
                System.out.print("Congratulations! Welcome to the Jedi Knight Military Academy!\n" +
                        "Application Status: Accepted");
            } else {
                System.out.print("We regret to inform you that you are not accepted in the Jedi Knight Military Academy!\n" +
                        "Application Status: Rejected");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}

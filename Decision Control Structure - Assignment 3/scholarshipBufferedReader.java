package DCS_Ass3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class scholarshipBufferedReader {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your NSAT score: ");
            String nsatScoreInput = dataIn.readLine();
            double nsatScore = Double.parseDouble(nsatScoreInput);
            System.out.print("Enter your parents' salary: ");
            String salaryInput = dataIn.readLine();
            double salary = Double.parseDouble(salaryInput);
            System.out.print("Enter your entrance exam score: ");
            String examScoreInput = dataIn.readLine();
            double examScore = Double.parseDouble(examScoreInput);
            double nsatExamMean = (nsatScore + examScore) / 2;

            if (salary > 10000 || nsatScore < 90 || examScore < 85) {
                System.out.println("Sorry!\nScholarship Status: Rejected");
            } else if (salary <= 3500 && nsatExamMean >= 91) {
                System.out.println("Congratulations!\nScholarship Status: Accepted");
            } else {
                System.out.println("Please wait for your result!\nScholarship Status: Subjected for further study");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}

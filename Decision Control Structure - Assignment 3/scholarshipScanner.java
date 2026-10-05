package DCS_Ass3;
import java.util.Scanner;
public class scholarshipScanner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double nsatScore;
        double salary;
        double examScore;
        System.out.print("Enter your NSAT score: ");
        nsatScore = scanner.nextDouble();;
        System.out.print("Enter your parents' salary: ");
        salary = scanner.nextDouble();
        System.out.print("Enter your entrance exam score: ");
        examScore = scanner.nextDouble();
        double nsatExamMean = (nsatScore + examScore) / 2;

        if (salary > 10000 || nsatScore < 90 || examScore < 85) {
            System.out.print("Sorry!\nApplication status: Rejected");
        } else if (salary <= 3500 || nsatExamMean >= 91) {
            System.out.print("Congratulations!\nApplicaion status: Accepted");
        } else {
            System.out.print("Please wait for your result!\nApplication status: Subjected for further study");
        }
    }
}

package DCS_Ass4;
import java.util.Scanner;
public class jediAcademyScanner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int height;
        int age;
        char citizenshipCode;
        char recommendeeCode;
        System.out.print("Enter your height in cm: ");
        height = scanner.nextInt();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("What is your citizenship code? (C - Citizen of Endor, N - Non-Citizen) ");
        citizenshipCode = scanner.next().charAt(0);
        System.out.print("Are you recommended by Jedi Master Obi Wan? (R - Recommendee, N - Non-recommendee) ");
        recommendeeCode = scanner.next().charAt(0);

        if (recommendeeCode == 'R'){
            System.out.print("Congratulations! Welcome to the Jedi Knight Military Academy!\n" +
            "Application Status: Accepted");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenshipCode == 'C') {
            System.out.print("Congratulations! Welcome to the Jedi Knight Military Academy!\n" +
                    "Application Status: Accepted");
        } else {
            System.out.print("We regret to inform you that you are not accepted in the Jedi Knight Military Academy!\n" +
                    "Application Status: Rejected");
        }
    }
}

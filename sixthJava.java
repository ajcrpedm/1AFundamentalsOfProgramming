import java.util.Scanner;
public class sixthJava {
    public static void main (String[] args){
        String name;
        int age;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old. ");
    }
}

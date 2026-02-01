import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
        } catch (Exception e) {
            System.out.println("Invalid input, please enter a number.");
        }
    }
}

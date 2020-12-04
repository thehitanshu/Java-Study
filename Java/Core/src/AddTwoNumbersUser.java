
import java.util.Scanner;

public class AddTwoNumbersUser {
    public static void main(String args[]) {

        int firstNumber;
        int secondNumber;
        int result;

        Scanner in = new Scanner(System.in);
        // First User Input
        System.out.println("Enter number 1:");
        firstNumber = in.nextInt();

        // Second User Input
        System.out.println("Enter number 2:");
        secondNumber = in.nextInt();

        // First and Second Input Add
        System.out.println("Your Added value is: ");
        result = firstNumber + secondNumber;

        System.out.println(result);
        //TODO: Edit the inputs
    }
}

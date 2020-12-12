import java.util.Scanner;

public class Fectorial {

    public static void main(String args[]) {

        int number;
        int factorial = 1;
        System.out.println("Enter a Number for Factorial: ");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Please enter a number generater than 0");
        }
        else {
            for (int l =1; l <= number; l++){
                factorial = factorial *l;
            }
        }
        System.out.println("Factorial is: " + factorial);
    }
}

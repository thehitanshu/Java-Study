import java.util.Scanner;
public class LargestOfThree {

    public static void main(String args[]) {

        int numberOne, numberTwo, numberThree;
        System.out.println("Please Enter three Numbers");

        Scanner in = new Scanner(System.in);

        numberOne = in.nextInt();
        numberTwo = in.nextInt();
        numberThree = in.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne + " is lagest number");
        }
        if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo + " is lagest number");
        }
        if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println(numberThree + " is lagest number");
        }

    }
}

import java.util.Scanner;
public class FahrenhiteToCenlies {

    public static void main(String args[]) {

        int temp;
        Scanner in = new Scanner(System.in);
        System.out.println("ENter temp in F: ");
        temp = in.nextInt();
        temp = ((temp -32) * 5)/9;
        System.out.println("Tempreture in Celsius is : " + temp);

    }
}

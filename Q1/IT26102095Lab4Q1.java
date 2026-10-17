
import java.util.Scanner;

public class IT26102095Lab4Q1 {

    public static void main(String[] args) {

        double number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Your number is zero");
        }

        input.close();
    }
}
	

import java.util.Scanner;

public class IT26102095Lab4Q2 {

    public static void main(String[] args) {

        double examMarks, labMarks;
        double examPercentage, labPercentage, finalMarks;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exam marks (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid Input");
            input.close();
            return;
        }

        System.out.print("Enter the lab submission marks (out of 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid Input");
            input.close();
            return;
        }

        System.out.print("Enter the percentage for exam (out of 100): ");
        examPercentage = input.nextDouble();

        System.out.print("Enter the percentage for lab (out of 100): ");
        labPercentage = input.nextDouble();

        if (examPercentage < 0 || examPercentage > 100 ||
            labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid percentage");
            input.close();
            return;
        }

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100.");
            input.close();
            return;
        }

        finalMarks = (examMarks * examPercentage / 100)
                   + (labMarks * labPercentage / 100);

        System.out.println("Final Exam mark is: " + finalMarks);

        input.close();
    }
}

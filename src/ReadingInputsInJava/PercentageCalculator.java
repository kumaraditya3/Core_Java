package ReadingInputsInJava;
import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int marks_1 = sc.nextInt();

        int marks_2 = sc.nextInt();

        int marks_3 = sc.nextInt();

        int total_marks = marks_1 + marks_2 + marks_3 ;
        System.out.println("Total Marks: " + total_marks);
        int percentage = (marks_1 + marks_2 + marks_3)/3;
        System.out.println("Percentage: "+percentage);

    }
}

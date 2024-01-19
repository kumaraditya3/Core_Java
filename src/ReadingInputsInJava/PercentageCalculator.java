package ReadingInputsInJava;
import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;

        int marks_1 = sc.nextInt();
        ++count;
        int marks_2 = sc.nextInt();
        ++count;
        int marks_3 = sc.nextInt();
        ++count;
        int total_marks = marks_1 + marks_2 + marks_3 ;
        System.out.println("Total Marks: " + total_marks);
        double percentage = (((marks_1 + marks_2 + marks_3)/300)*100d);
        System.out.println("Percentage: "+percentage);

    }
}

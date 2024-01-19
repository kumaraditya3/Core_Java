package basic_Q;
import java.util.Scanner;

public class StringInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name : ");
        String Name = sc.nextLine();
        System.out.println("Your full name is : "+ Name);
    }
}

package basic_Q;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the principal amount : ");
        float principal = sc.nextFloat();
        System.out.println("Your entered Principal amount is : "+ principal);
        System.out.println("Please enter the rate of Interest: ");
        float roi = sc.nextFloat();
        System.out.println("Your entered rate of Interest is : " + roi);
        System.out.println("Please enter the time bond in Years : ");
        float time= sc.nextFloat();
        System.out.println("Your entered time is : "+ time);
        float si = (principal * roi * time)/100;
        System.out.println("You calculated Simple Interest is : "+ si );
        System.out.println("............Program Terminating..............");
    }
}

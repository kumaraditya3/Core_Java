package basic_Q;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter the first number to sum :");
        int a = sc.nextInt();
        System.out.println("Your first Number is : "+a);
        System.out.println("Now enter your second number to add : ");
        int b= sc.nextInt();
        System.out.println("Your second number is : "+b);
        int z=a+b;
        System.out.println("The sum of these two numbers is : "+ z);
    }
}

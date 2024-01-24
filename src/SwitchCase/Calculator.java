package SwitchCase;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an operator from ( +, - , * , /): ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter two numbers to perform the operation:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(operator){
            case '+':
               System.out.println("The summation of a and b is : "+(a+b));
                break;
            case '-':
                System.out.println("The difference of a and b is : "+(a-b));
                break;
            case '*':
                System.out.println("The product of a and b is : "+(a*b));
                break;
            case '/' :
                System.out.println("The quotient of a and b is : "+(a/b));


        }
    }
}

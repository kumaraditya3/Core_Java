package OperatorsAndItsAssociativity;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping a ="+ a);
        System.out.println("Before swapping b ="+ b);
         a= a+b;
         b = a-b;
         a = a-b;
        System.out.println("After Swapping A = "+a);
        System.out.println("After Swapping B = "+b);
    }
}

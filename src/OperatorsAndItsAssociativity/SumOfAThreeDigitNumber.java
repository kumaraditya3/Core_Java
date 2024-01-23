package OperatorsAndItsAssociativity;
import java.util.Scanner;
public class SumOfAThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum=0;
//        int second_digit = sc.nextInt();
//        int third_digit = sc.nextInt();
        while(number>0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}

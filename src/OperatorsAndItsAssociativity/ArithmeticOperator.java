package OperatorsAndItsAssociativity;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z=(((x+8)/3)%5)*5;
        System.out.println(z);
    }
}

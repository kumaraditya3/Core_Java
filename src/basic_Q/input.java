package basic_Q;
import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your Lucky Number.");
        int luckyNumber = sc.nextInt();
        System.out.println("Your Lucky Number is : "+ luckyNumber);
    }
}

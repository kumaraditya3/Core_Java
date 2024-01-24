package ifelse;
import java.util.Scanner;
public class PrintOnlyPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("The number is : "+number);
        } else if (number<0) {
            System.out.println("Number is negative and skipped.");

        }
        else{
            System.out.println("Please enter either +ve or - ve number.");
        }
    }
}

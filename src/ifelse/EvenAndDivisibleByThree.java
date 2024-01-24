package ifelse;
import java.util.Scanner;
public class EvenAndDivisibleByThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0 && a%3==0){
            System.out.println("Yes, number is Even and it is divisible by 3.");
        }
        else{
            System.out.println("Either the number is not even or it is not divisble by 3");
        }
    }
}

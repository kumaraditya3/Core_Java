package LogicalOperators;
import java.util.Scanner;

public class AllOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num>10 && num<400 && num%8==0)||(num>=400 && num<700) ){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}

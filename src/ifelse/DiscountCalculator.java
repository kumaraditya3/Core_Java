package ifelse;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int discount = 0;
        if(amount>=1000){
            System.out.println("You are Eligible for a discount..");
            System.out.println("Your discounted price is:"+ (amount-amount/10));
            System.out.println("!!! HAPPY SHOPPING !!!");
        }
        else{
            System.out.println("Sorry, You'll have to make a purchase  of more than rs 1000 for being eligible for a discount.");
            System.out.println("!!! HAPPY SHOPPING !!!");
        }

    }
}

package ifelse;
import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the cost price: ");
        double cp = sc.nextInt();
        System.out.println("Now, enter the selling price");
        double sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Yay! You made a profit worth rs. : "+(sp-cp));

        }
        else if(cp>sp){
            System.out.println("Sorry, You made a loss worth rs. : " + (cp-sp));
        }
        else{
            System.out.println("You neither made any profit nor any loss;");
        }
    }
}

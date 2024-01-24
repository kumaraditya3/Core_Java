package ifelse;
import java.util.Scanner;
public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and Breadth Respectively: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("It's a square.");

        }
        else{
            System.out.println("It's a Rectangle.");
        }
    }
}

package basic_Q;
import java.util.Scanner;
public class StringAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name : ");
       /* Character name = sc.next().charAt(0);
        System.out.println("The first Letter of your entered name is : "+ name);*/
        //Similarly we can Get all the Letter of our Name or from any string
        // That the user Inputs.
        Character name = sc.next().charAt(4);
        System.out.println("The fourth Letter of your entered name is : "+ name);
    }
}

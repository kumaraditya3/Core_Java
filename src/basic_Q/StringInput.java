package basic_Q;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name : ");
        String name = sc.next();
        System.out.println("Your Name is : "+ name);
        /*If I input , Names with Space as Aditya Kumar then
        it will only output as Aditya and not Aditya Kumar .
        This is because I have just used sc.next()*/
    }
}

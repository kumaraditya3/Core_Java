package ifelse;
import java.util.Scanner;
public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 || a%5==0){
            System.out.println("Found answer:"+a);

        }
        else{
            System.out.println("Number not divisible by 3 or 5");
        }
    }
}

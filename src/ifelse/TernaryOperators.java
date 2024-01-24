package ifelse;
import java.util.Scanner;
public class TernaryOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans;
        ans = (num%2==0?"Even":"Odd");
        System.out.println(ans);
    }
}

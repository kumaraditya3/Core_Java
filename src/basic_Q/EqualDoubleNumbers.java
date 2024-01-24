package basic_Q;
import java.util.Scanner;
import java.lang.Math;
public class EqualDoubleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        a*=1000;
        b*=1000;
        a=Math.round(a);
        b=Math.round(b);
        a=a/1000;
        b=b/1000;
        if(a==b){
        System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }

    }
}

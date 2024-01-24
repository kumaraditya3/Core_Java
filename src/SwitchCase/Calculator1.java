package SwitchCase;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = x+y;
        System.out.println(result);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

    }
}

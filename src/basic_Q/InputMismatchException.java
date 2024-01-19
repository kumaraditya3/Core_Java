package basic_Q;
import java.util.Scanner;
public class InputMismatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        int q = sc.nextInt();
        System.out.println(p+ " " +q);

    }
}

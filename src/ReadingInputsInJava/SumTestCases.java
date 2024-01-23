package ReadingInputsInJava;
import java.util.Scanner;
public class SumTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for(int i=0; i<test_cases;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}

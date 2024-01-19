package basic_Q;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 2, b=3;
        System.out.println("Data before swapping : "+a +" "+b);
        int c;
        c = a;
        a=b;
        b=c;
        System.out.println("data after swapping : "+a +" "+ b);
    }
}

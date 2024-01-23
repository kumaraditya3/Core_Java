package BitwiseOperatorsInJava;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a=9;
        int b = 10;
        System.out.println(a|b);   //11
        System.out.println(a&b);   //8
        System.out.println(a^b);   //3
        System.out.println(~a);    //-10
        System.out.println(a<<1);  //18
        System.out.println(a>>1);  //4

    }
}

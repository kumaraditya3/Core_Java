package BitwiseOperatorsInJava.ReverseAnumber;

public class ReverseANumber {
    public static void main(String[] args) {
        int x =123;
        int fd = x/100;
        x=x%100;
        int sd = x/10;
        int td = x%10;
        int rev = td*100 + sd *10 + fd*1 ;
        System.out.println("Reverse: "+ rev);



    }
}


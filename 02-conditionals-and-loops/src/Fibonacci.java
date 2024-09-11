import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("upto");
        int a=0;
        int b=1;

        for(int i=0;i<7;i++){
            int temp=b;
            System.out.println(a);
            b=b+a;
            a=temp;
        }
    }
}

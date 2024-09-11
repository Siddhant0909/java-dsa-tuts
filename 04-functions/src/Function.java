import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //take input of two numbers and print the sum
        sum();
//        int result=sum2();
//        System.out.println("Sum  = " + result);

    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum  = " + sum);
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        return num1 + num2 ;
    }
}

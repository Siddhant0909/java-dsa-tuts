import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        checkPrime(num);
    }
    static void checkPrime(int num) {
        int rem=0;
        for(int i = 2; i * i <= num; i++) {
            rem = num % i;
            if(rem==0){
                System.out.println(num+" is not prime");
                break;
            }
        }
        if(rem!=0){
            System.out.println(num+" is prime");
        }
    }
}

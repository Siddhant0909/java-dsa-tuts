import java.util.Scanner;

public class CompareNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        //Method1
//        System.out.println("enter num 1");
//        int num1=input.nextInt();
//        System.out.println("enter num 2");
//        int num2=input.nextInt();
//        System.out.println("enter num 3");
//        int num3=input.nextInt();
//
//        int max=num1;
//        if(num2>max){
//            max=num2;
//        }
//        if (num3>max) {
//            max=num3;
//        }
//        System.out.println("The maximum is "+max);
//        Method2
        int a=100;
        int b=200;
        int c=300;
        int maximum=Math.max(c,Math.max(a,b));
        System.out.println("The maximum is "+maximum);
    }
}

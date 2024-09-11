import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res=0;
        while (true) {
            System.out.print("Enter operation : ");
            char op=input.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter two number");
                int num1=input.nextInt();
                int num2=input.nextInt();
                if(op=='+') res=num1+num2;
                if(op=='-') res=num1-num2;
                if(op=='*') res=num1*num2;
                if(op=='%') res=num1%num2;
                if(op=='/') {
                    if(num2!=0) res=num1/num2;
                    else {
                        System.out.println("zero cannot be used as denominator");
                        continue;
                    }
                }
                System.out.println("Result : "+res);
            } else if (op=='x'||op=='X') {
                break;
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}

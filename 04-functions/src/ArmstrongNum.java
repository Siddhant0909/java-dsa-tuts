import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int num = input.nextInt();
//        boolean isArm = check(num);
//        System.out.println(isArm);

        for (int i =100; i<1000; i++){
            if(check(i)) System.out.print(i+" ");
        }

    }
    static boolean check(int num) {
        int originalNum=num;
        int checkNum=0;
        while(num!=0) {
            int rem=num%10;
            checkNum=(rem*rem*rem)+checkNum;
            num=num/10;
        }
        return originalNum==checkNum;
    }
}

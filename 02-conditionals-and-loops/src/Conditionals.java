import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=input.nextInt();
        if(salary>10000){
            System.out.println("bonus : 2000");
        }
        else {
            System.out.println("bonus : 1000");
        }
    }
}
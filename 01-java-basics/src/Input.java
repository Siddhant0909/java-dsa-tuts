import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your roll number");
        int rollNo=input.nextInt();
        System.out.println("Your roll number is " + rollNo);
        System.out.println("Enter your name");
        String name=input.next();
        System.out.println("Your name is " + name);
    }
}

import java.lang.reflect.Array;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("Not an adult");
        }
        for (int i=0;i<3;i++){
            System.out.println("Siddhant");
        }

    }
}

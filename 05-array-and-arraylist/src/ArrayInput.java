import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++) {
            System.out.println("Enter value of index "+i);
            arr[i]=input.nextInt();
        }
        for(int val : arr) {
            System.out.print(val+" ");
        }
    }
}

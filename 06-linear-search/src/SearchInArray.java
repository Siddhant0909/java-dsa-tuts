import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myArr = {1,2,3,4,5,6};
        System.out.println("Enter a number to find from "+Arrays.toString(myArr));
        int target = input.nextInt();
        boolean ans = isPresent(myArr, target);
        System.out.println(ans);

    }
    static boolean isPresent(int[] arr, int target) {
        if(arr.length == 0) return false;
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] == target) return true;
        }
        return false;
    }
}
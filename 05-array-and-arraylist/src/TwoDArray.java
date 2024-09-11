import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] twoDArr= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(twoDArr[0]));

        int[][] my2dArr = new int[3][2];

        for (int i = 0; i < my2dArr.length; i++) {
            for (int j = 0; j < my2dArr[i].length; j++) {
                System.out.println("Enter value for my2dArr[" + i + "][" + j + "]");
                my2dArr[i][j] = input.nextInt();
            }
        }

        for (int[] val:my2dArr) {
            System.out.println(Arrays.toString(val));
        }
    }
}

import java.util.Arrays;

public class ChangeVal {
    public static void main(String[] args) {
        int[] myArr = {1, 3, 2, 45, 6};

        System.out.println(Arrays.toString(myArr));//[1, 3, 2, 45, 6]

        change(myArr);

        System.out.println(Arrays.toString(myArr));//[100, 3, 2, 45, 6]
    }
    static void change(int[] arr) {
        arr[0]=100;
    }
}

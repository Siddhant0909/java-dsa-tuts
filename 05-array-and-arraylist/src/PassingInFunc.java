import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4};
        System.out.println(Arrays.toString(myArr));
        change(myArr);
        System.out.println(Arrays.toString(myArr));
    }
    static void change (int[] arr){
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
    }
}

public class FindMinInArr {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int val : arr) {
            if (minVal > val) minVal = val;
        }
        return minVal;
    }
}

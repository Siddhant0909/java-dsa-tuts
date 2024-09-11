public class FindNumWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(find(nums));
    }
//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    static int find(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num != 0) {
                num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}

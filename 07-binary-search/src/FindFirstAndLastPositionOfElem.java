import java.util.Arrays;

public class FindFirstAndLastPositionOfElem {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = searchRangeBrute(nums, target);
        System.out.println(Arrays.toString(ans));
        int[] ans2 = searchRangeDAQ(nums, target);
        System.out.println(Arrays.toString(ans2));
    }

    //BRUTE FORCE
    static int[] searchRangeBrute(int[] nums, int target) {
        int[] ans = {-1, -1};
        for (int start = 0; start < nums.length; start++) {
            if (nums[start] == target) {
                ans[0] = start;
                break;
            }
        }
        for (int end = nums.length - 1; end >= 0; end--) {
            if (nums[end] == target) {
                ans[1] = end;
                break;
            }
        }
        return ans;
    }

    //DIVIDE AND CONQUER
    static int[] searchRangeDAQ(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);
        return ans;
    }

    static int binarySearch(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

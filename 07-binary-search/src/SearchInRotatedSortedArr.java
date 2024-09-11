public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 2, 3, 4, 5};
        int target = 6;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println("pivot: " + pivot);

        int firstHalfSearch = binarySearch(nums, target, 0, pivot);
        if (firstHalfSearch == -1) {
            int seacondHalfSearch = binarySearch(nums, target, pivot + 1, nums.length - 1);
            return seacondHalfSearch;
        }
        return firstHalfSearch;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

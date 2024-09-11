public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 11;
        int ans = binarySearch(myArr, target);
        System.out.println("found at index " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        int mid = (start + end) / 2;
        int cycle = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
//                mid = (start + end) / 2;
            } else if (arr[mid] < target) {
                start = mid + 1;
//                mid = (start + end) / 2;
            } else if (arr[mid] == target) {
                System.out.println("cycle: " + (cycle += 1));
                return mid;
            }
            System.out.println("cycle: " + (cycle += 1));
        }
        return -1;
    }
}
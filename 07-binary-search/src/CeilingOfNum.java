public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceil(arr, target);
        System.out.println("ans: " + ans);
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }

//    static int ceil(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        int mid;
//        while (target <= arr[end]) {
//            while (start <= end) {
//                mid = start + (end - start) / 2;
//                if (arr[mid] < target) {
//                    start = mid + 1;
//                } else if (arr[mid] > target) {
//                    end = mid - 1;
//                } else {
//                    return arr[mid];
//                }
//            }
//            start = 0;
//            end = arr.length - 1;
//            target += 1;
//        }
//        return Integer.MAX_VALUE;
//    }
}

public class PeakIndexInMountainArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};
//        int ans = peakIndexInMountainArr(arr);
//        System.out.println(ans);
        int ans2 = search(arr);
        System.out.println(ans2);
    }

    //    BRUTE FORCE
    static int peakIndexInMountainArr(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

        }

        return maxIndex;
    }

    // BINARY SEARCH
    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

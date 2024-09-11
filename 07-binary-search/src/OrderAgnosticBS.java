public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] descArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr = {3, 3, 3, 3, 3, 3, 3, 3, 3};
        int target = 3;
        int ans1 = orderAgnBS(ascArr, target);
        int ans2 = orderAgnBS(descArr, target);
        int ans3 = orderAgnBS(arr, target);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int orderAgnBS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid = start + (end - start) / 2;
        if (array[start] > array[end]) {
            //descending
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (array[mid] > target) {
                    start = mid + 1;
                } else if (array[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else if (array[start] < array[end]) {
            //ascending
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (array[mid] < target) {
                    start = mid + 1;
                } else if (array[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            if (array[start] == target) return start;
        }
        return -1;
    }
}

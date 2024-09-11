import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //    static void quickSort(int[] arr, int low, int hi) {
//        if (low >= hi) {
//            return;
//        }
//        int s = low;
//        int e = hi;
//        int mid = (s + e) / 2;
//        int pivot = arr[mid];
//        while (s <= e) {
//            while (arr[s] < pivot) {
//                s++;
//            }
//            while (arr[e] > pivot) {
//                e--;
//            }
//            if (s <= e) {
//                int temp = arr[s];
//                arr[s] = arr[e];
//                arr[e] = temp;
//                s++;
//                e--;
//            }
//        }
//        quickSort(arr, low, e);
//        quickSort(arr, s, hi);
//    }
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }

    static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = pivot;
        pivot = temp;
        return j;
    }
}

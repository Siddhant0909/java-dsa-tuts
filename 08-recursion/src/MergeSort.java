import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 8, 7, 6, 9};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        mergeSortInplace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeSortInplace(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid + 1, end);

        mergeInplace(arr, start, mid, end);
    }

    static void mergeInplace(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> mix = new ArrayList<>();
        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix.add(arr[i]);
                i++;
            } else {
                mix.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            mix.add(arr[i]);
            i++;
        }
        while (j <= end) {
            mix.add(arr[j]);
            j++;
        }
        for (int l = 0; l < mix.size(); l++) {
            arr[start + l] = mix.get(l);
        }
    }
}


import java.util.ArrayList;

public class Recur {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3};
        System.out.println(isSorted(arr, 0));
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(linearSearch(arr, 3, 0, list));
        System.out.println(linearSearch2(arr, 3, 0));
    }

    static ArrayList<Integer> linearSearch(int[] arr, int target, int start, ArrayList<Integer> list) {
        if (start > arr.length - 1) {
            return list;
        }
        if (arr[start] == target) {
            list.add(start);
        }
        return linearSearch(arr, target, start + 1, list);
    }

    static ArrayList<Integer> linearSearch2(int[] arr, int target, int start) {

        ArrayList<Integer> list = new ArrayList<>();

        if (start > arr.length - 1) {
            return list;
        }
        if (arr[start] == target) {
            list.add(start);
        }
        ArrayList<Integer> allAns = linearSearch2(arr, target, start + 1);
        list.addAll(allAns);
        return list;
    }

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 2) {
            return arr[i] < arr[i + 1];
        }
//        if (arr[i] > arr[j]) return false;
        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
    }
}

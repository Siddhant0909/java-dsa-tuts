import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
//        System.out.println(subSeq("", "abc"));
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        System.out.println(powerSet(arr, new ArrayList<>(), 0));
//        powerSet(arr, new ArrayList<>(), 0, list);
//        System.out.println(list);
        System.out.println(powerSetSum(arr, new ArrayList<>(), 0));
    }

//    static void powerSet(int[] arr, ArrayList<Integer> set, int i) {
//        if (i == arr.length) {
//            System.out.println(set);
//            return;
//        }
//        set.add(arr[i]);
//        powerSet(arr, set, i + 1);
//        set.removeLast();
//        powerSet(arr, set, i + 1);
//
//    }

    static void powerSet(int[] arr, ArrayList<Integer> set, int i, ArrayList<ArrayList<Integer>> list) {
        if (i == arr.length) {
            list.add(new ArrayList<>(set));
            return;
        }
        set.add(arr[i]);
        powerSet(arr, set, i + 1, list);
        set.removeLast();
        powerSet(arr, set, i + 1, list);
    }

    static ArrayList<ArrayList<Integer>> powerSet(int[] arr, ArrayList<Integer> set, int i) {
        if (i == arr.length) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(set));
            return list;
        }
        set.add(arr[i]);
        ArrayList<ArrayList<Integer>> left = powerSet(arr, set, i + 1);
        set.removeLast();
        ArrayList<ArrayList<Integer>> right = powerSet(arr, set, i + 1);
        left.addAll(right);
        return left;

    }

    static ArrayList<ArrayList<Integer>> powerSetSum(int[] arr, ArrayList<Integer> set, int i) {
        if (i == arr.length) {
            int sum = 0;
            for (int val : set) sum += val;
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            if (sum == 2) {
                list.add(new ArrayList<>(set));
            }
            return list;
        }
        set.add(arr[i]);
        ArrayList<ArrayList<Integer>> left = powerSetSum(arr, set, i + 1);
        set.removeLast();
        ArrayList<ArrayList<Integer>> right = powerSetSum(arr, set, i + 1);
        left.addAll(right);
        return left;

    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseq(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1), list);
        subseq(p, up.substring(1), list);
        return list;
    }

    static ArrayList<String> subSeq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p + ch, up.substring(1));
        ArrayList<String> right = subSeq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}

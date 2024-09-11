public class MaxElem {
    public static void main(String[] args) {
        int[] arr = {1,10,20,2,45};
        System.out.println(maxElem(arr));
    }
    static int maxElem(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}

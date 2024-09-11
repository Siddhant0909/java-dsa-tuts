public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] account = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(account));
    }

    static int maximumWealth(int[][] arr) {
        int maxWealth = Integer.MIN_VALUE;
        for (int customer = 0; customer < arr.length; customer++) {
            int wealth = 0;
            for (int bank = 0; bank < arr[customer].length; bank++) {
                wealth += arr[customer][bank];
            }
            if (wealth > maxWealth) maxWealth = wealth;
        }
        return maxWealth;
    }
}

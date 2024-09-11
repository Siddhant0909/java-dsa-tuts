public class Main {
    public static void main(String[] args) {
//        message(1);
//        int ans = fibo(4);
//        System.out.println(ans);
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int target = 6;
//        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
//        print(5);
//        System.out.println(factorial(0));
//        System.out.println(sumOfDig(752));
//        System.out.println(prod(51213));
//        System.out.println(rev(123456789));
//        System.out.println(palin(123421));
//        System.out.println(countZero(0, 0));
        System.out.println(stepToReduToZero(8));
    }

    static int stepToReduToZero(int num) {
        int count = 0;
        return helper2(num, count);
    }

    static int helper2(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return helper2(num / 2, count + 1);
        }
        return helper2(num - 1, count + 1);
    }

    static int countZero(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0) {
            return countZero(num / 10, count + 1);
        }
        return countZero(num / 10, count);
    }

    static boolean palin(int num) {
        return num == rev(num);
    }

    static int rev(int num) {
        int ans = 0;
        return helper(num, ans);
    }

    static int helper(int num, int ans) {
        if (num == 0) {
            return ans;
        }
        ans = (num % 10) + (ans * 10);
        return helper(num / 10, ans);
    }

    static int prod(int num) {
        if (num % 10 == num) {
            return num;
        }
        return (num % 10) * prod(num / 10);
    }

    static int sumOfDig(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDig(num / 10);
    }

    static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print(num - 1);
        System.out.println(num);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, mid - 1);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static void message(int n) {
        if (n == 5) {
            System.out.println("Hello World");
            return;
        }
        System.out.println("Hello World");
        message(n + 1);
    }
}
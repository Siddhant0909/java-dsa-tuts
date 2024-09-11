import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        String str = "baccapplead";
//        StringBuilder ans = new StringBuilder("");
        System.out.println(removeAllA(str));
        System.out.println(removeApple(str));
    }

    static String removeAllA(String str, int i) {
        if (i == str.length()) {
            return "";
        }
        if (str.charAt(i) != 'a') {
            return str.charAt(i) + removeAllA(str, i + 1);
        }
        return removeAllA(str, i + 1);
    }

    static String removeAllA(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch != 'a') {
            return ch + removeAllA(str.substring(1));
        }
        return removeAllA(str.substring(1));
    }

    static String removeApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (str.startsWith("apple")) {
            return removeApple(str.substring(5));
        }
        return ch + removeApple(str.substring(1));
    }
}

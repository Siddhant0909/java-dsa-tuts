import java.util.ArrayList;

public class KeyPad {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(keyPad("", "79", list));
    }

    static ArrayList<String> keyPad(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
//            System.out.println(p);
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        int sRng = 0;
        int eRng = 0;

        if (digit > 1 && digit < 8) {
            sRng = 3 * (digit - 2);
            if (digit < 7) {
                eRng = 3 * (digit - 1);
            } else {
                eRng = (3 * (digit - 1)) + 1;
            }
        } else if (digit > 7) {
            sRng = 3 * (digit - 2) + 1;
            if (digit == 9) {
                eRng = (3 * (digit - 1)) + 2;
            } else {
                eRng = (3 * (digit - 1)) + 1;
            }
        }

        for (int i = sRng; i < eRng; i++) {
            char ch = (char) ('a' + i);
            keyPad(p + ch, up.substring(1), list);
        }
        return list;
    }
}

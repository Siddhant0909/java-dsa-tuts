public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x);
        int x=200;
        System.out.println(x);
    }
}

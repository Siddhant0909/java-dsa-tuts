public class MethodOverloading {
    public static void main(String[] args) {
        print(10);
        print("siddhant");
//        print(); this will not work
    }
    static void print(int num) {
        System.out.println(num);
    }
    static void print(String name) {
        System.out.println(name);
    }
}

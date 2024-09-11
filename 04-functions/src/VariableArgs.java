import java.util.Arrays;

public class VariableArgs {//Varargs
    public static void main(String[] args) {
        myFun(10,20,30,40,50);
    }
    static void myFun(int...num) {
        System.out.println(Arrays.toString(num));
    }
}

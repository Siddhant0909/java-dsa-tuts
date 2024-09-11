public class TypeCasting {
    public static void main(String[] args) {
        //Implicit type casting
        char myChar=97;
        System.out.println(myChar);
        int num='a';
        System.out.println(num);
        //Explicit type casting
        int num2=(int)(96.97f);
        System.out.println(num2);
        //type promotion
        int a=1000;
        byte b=(byte) (a);
        System.out.println(b);
    }
}

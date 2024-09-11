public class ReverseNumber {
    public static void main(String[] args) {
        int num=23597;
        int newNumber=0;
        while(num!=0){
            int lastDig=num%10;
            newNumber=(newNumber*10)+lastDig;
            num=num/10;

        }
        System.out.println(newNumber);
    }
}

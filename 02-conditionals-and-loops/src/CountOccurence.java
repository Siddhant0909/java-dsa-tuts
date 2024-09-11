public class CountOccurence {
    public static void main(String[] args) {
        int num=183339;
        int count=0;
        while (num!=0){
            int lastDig=num%10;
            if(lastDig==3){
                count++;
            }
            num=num/10;
        }
        System.out.println("occurrence "+count);
    }
}

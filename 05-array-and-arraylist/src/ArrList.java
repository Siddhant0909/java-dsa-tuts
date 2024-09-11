import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> myArrList = new ArrayList<>(3);
        myArrList.add(10);
        myArrList.add(20);
        myArrList.add(30);
        myArrList.add(40);
        myArrList.remove(2);
        myArrList.addFirst(30);
        myArrList.addLast(60);
        myArrList.add(2,50);
        System.out.println(myArrList);
    }
}

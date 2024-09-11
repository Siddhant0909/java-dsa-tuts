import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of fruit");
        String fruit = input.nextLine().toLowerCase();
        switch (fruit){
            case "apple":
                System.out.println("Keeps the doctor away");
                break;
            case "mango":
                System.out.println("King of fruits");
                break;
            case "banana":
                System.out.println("suss");
                break;
            default:
                System.out.println("Pick from mango apple or Banana");
        }
    }
}
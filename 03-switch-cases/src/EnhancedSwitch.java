import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of fruit");
        String fruit = input.nextLine().toLowerCase();
        switch (fruit) {
            case "apple" -> System.out.println("Keeps the doctor away");
            case "mango" -> System.out.println("King of fruits");
            case "banana" -> System.out.println("suss");
            default -> System.out.println("Pick from mango apple or Banana");
        }
    }
}

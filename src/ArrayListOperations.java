import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();  

        String[] items = scanner.nextLine().split(" ");
        String searchItem = scanner.nextLine();

        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cart.add(items[i]);
        }

        Collections.sort(cart);

        System.out.println("Sorted Items: " + cart);

        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}

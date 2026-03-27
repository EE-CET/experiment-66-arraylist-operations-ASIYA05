
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if there is input available to avoid errors
        if (!sc.hasNextInt()) return;

        // 1. Read the number of items
        int n = sc.nextInt();
        ArrayList<String> cart = new ArrayList<>();

        // 2. Add items to the list
        for (int i = 0; i < n; i++) {
            cart.add(sc.next());
        }

        // 3. Read the item to search for
        String searchItem = sc.next();

        // 4. Sort the items alphabetically
        Collections.sort(cart);

        // 5. Print the final sorted list
        // ArrayList's toString() method matches the [Item1, Item2, ...] format
        System.out.println("Sorted Items: " + cart);

        // 6. Check if the item exists and print the result
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}

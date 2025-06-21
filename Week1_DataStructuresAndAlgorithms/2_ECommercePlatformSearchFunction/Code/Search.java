import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Product[] productArray = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Backpack", "Accessories")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        //Mo Linear Search
        System.out.println("\n Linear Search:");
        long startLinear = System.nanoTime();
        Product found1 = SearchAlgorithms.linearSearch(productArray, searchName);
        long endLinear = System.nanoTime();
        System.out.println(found1 != null ? found1 : "Product not found");
        System.out.println("Time Taken: " + (endLinear - startLinear) + " ns");
        System.out.println("Time Complexity: Best O(1), Avg/Worst O(n)");
        System.out.println("Space Complexity: O(1)");

        // Binary Search (needs sorted input)
        Arrays.sort(productArray, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        System.out.println("\n Binary Search:");
        long startBinary = System.nanoTime();
        Product found2 = SearchAlgorithms.binarySearch(productArray, searchName);
        long endBinary = System.nanoTime();
        System.out.println(found2 != null ? found2 : "Product not found");
        System.out.println("Time Taken: " + (endBinary - startBinary) + " ns");
        System.out.println("Time Complexity: Best O(1), Avg/Worst O(log n)");
        System.out.println("Space Complexity: O(1) (iterative)");

        scanner.close();
    }
}


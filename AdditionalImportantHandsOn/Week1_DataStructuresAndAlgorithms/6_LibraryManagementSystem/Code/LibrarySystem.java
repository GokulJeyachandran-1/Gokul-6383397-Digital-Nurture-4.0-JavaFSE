import java.util.Scanner;
public class LibrarySystem{
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "Atomic Habits", "James Clear"),
            new Book(3, "Clean Code", "Robert C. Martin"),
            new Book(4, "Rich Dad Poor Dad", "Robert Kiyosaki"),
            new Book(5, "Ikigai", "Francesc Miralles")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String target = sc.nextLine();

        // Linear Search
        long startLinear = System.nanoTime();
        Book foundLinear = LibrarySearch.linearSearch(books, target);
        long endLinear = System.nanoTime();

        System.out.println("\nLinear Search:");
        if (foundLinear != null) {
            System.out.println("Found: " + foundLinear);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");


        // Binary Search
        long startBinary = System.nanoTime();
        Book foundBinary = LibrarySearch.binarySearch(books, target);
        long endBinary = System.nanoTime();

        System.out.println("\nBinary Search:");
        if (foundBinary != null) {
            System.out.println("Found: " + foundBinary);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("Binary search Time: " + (endBinary - startBinary) + " ns");

        sc.close();
    }
}

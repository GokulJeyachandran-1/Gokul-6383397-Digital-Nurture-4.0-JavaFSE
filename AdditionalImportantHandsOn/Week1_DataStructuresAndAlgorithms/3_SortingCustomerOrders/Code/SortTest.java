public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(201, "Alice", 1500.50),
            new Order(202, "Bob", 800.00),
            new Order(203, "Charlie", 2500.00),
            new Order(204, "David", 1200.00)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\nBubble Sort:");
        long startBubble = System.nanoTime();
        SortAlgorithms.bubbleSort(orders);
        long endBubble = System.nanoTime();
        System.out.println("Bubble Sort Time taken: " + (endBubble - startBubble) + " nanoseconds");
        for (Order o : orders) {
            System.out.println(o);
        }

        orders = new Order[] {
            new Order(201, "Alice", 1500.50),
            new Order(202, "Bob", 800.00),
            new Order(203, "Charlie", 2500.00),
            new Order(204, "David", 1200.00)
        };

        System.out.println("\nQuick Sort:");
        long startQuick = System.nanoTime();
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort Time taken: " + (endQuick - startQuick) + " nanoseconds");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}


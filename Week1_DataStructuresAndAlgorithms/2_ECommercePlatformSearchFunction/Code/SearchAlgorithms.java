
public class SearchAlgorithms {
    // Linear Search: O(n) time complexity, O(1) space complexity
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }
    

    // Binary Search: O(log n) time complexity, O(1) space complexity (iterative)
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) return products[mid];
            else if (comparison < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }   
}

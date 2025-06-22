import java.util.*;
public class LibrarySearch {

    // Linear Search
    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search - sorted beforehand
    public static Book binarySearch(Book[] books, String targetTitle) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        int low = 0;
        int high = books.length - 1;
        targetTitle = targetTitle.toLowerCase();
        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = books[mid].getTitle().compareTo(targetTitle);

            if (compare == 0) {
                return books[mid];
            } 
            else if (compare < 0) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return null;
    }
}


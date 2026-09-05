import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LibraryBookTracker {
    public static void main(String[] args) {

        Set<Integer> bookIds = new HashSet<>();

        Map<Integer, String> books = new HashMap<>();

        addBook(bookIds, books, 101, "Java Basics");
        addBook(bookIds, books, 102, "Python Fundamentals");
        addBook(bookIds, books, 103, "Database Systems");
        addBook(bookIds, books, 104, "Web Development");
        addBook(bookIds, books, 103, "Another Book");

        IO.println("\n========== LIBRARY BOOK TRACKER ==========");

        for (Map.Entry<Integer, String> book : books.entrySet()) {

            IO.println(
                    "Book ID: " + book.getKey()
                            + " | Title: "
                            + book.getValue()
            );
        }

        IO.println("\nTotal Books: " + books.size());
    }
}
